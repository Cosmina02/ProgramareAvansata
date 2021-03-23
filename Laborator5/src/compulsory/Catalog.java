package compulsory;



import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.awt.Desktop;
import java.util.StringTokenizer;

public class Catalog implements Serializable {

    private String name;
    private String path;
    public List<Item>items= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidDataException {
        if(name==null) throw new InvalidDataException("Catalog Name");
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) throws InvalidDataException {
        if(path==null) throw new InvalidDataException("path");
        this.path = path;
    }

    public List<Item> getItems() {
        return items;
    }

    public void add(Item item) throws InvalidDataException {
        if(item==null) throw new InvalidDataException("item");
        items.add(item);
    }

    public void list(){
        System.out.println("The name of the catalog is "+name);
        System.out.println("The path of the catalog is "+path);
        System.out.println("The items found in the catalog: "+items.toString());
    }


    public void play(int index) throws IOException, URISyntaxException {
        try {
            if (this.items.get(index).getLocation().contains("C:")||this.items.get(index).getLocation().contains("d:")) {
                File file = new File(this.items.get(index).getLocation());
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            if (this.items.get(index).getLocation().contains("https:")) {
                URI uri = new URI(this.items.get(index).getLocation());
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

    public void save(Catalog cat) throws IOException{

            try (var oos = new ObjectOutputStream( new FileOutputStream(cat.getPath()))) {
                oos.writeObject(cat);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
    }

   private int StringToInt(String str){
       int result = 0;
       for (int i =0; i < str.length(); i++){
           char digit = (char)(str.charAt(i) - '0');
           result += (digit * Math.pow(10, (str.length() - i - 1)));

       }
       return result;
   }

    public void load(String path) throws IOException {
        try {
            String data ="";
            data = new String(Files.readAllBytes(Paths.get(path)));//gets the data from the file
            StringTokenizer tokenizer = new StringTokenizer(data, "\r\n"); //splits the text into tokens
            String strbuffer=tokenizer.nextToken();
            //adds the data in the catalog
            this.setName(strbuffer);
            strbuffer=tokenizer.nextToken();
            this.setPath(strbuffer);
            while(tokenizer.hasMoreTokens()){
                strbuffer=tokenizer.nextToken();
                //check if it's a song or a movie and then creates the item and adds it to the list
                if(strbuffer.startsWith("Song: ")){
                    strbuffer=strbuffer.replace("Song: ","");
                    String id,name,location,author;
                    int year;
                    id=strbuffer;
                    name=tokenizer.nextToken();
                    location=tokenizer.nextToken();
                    author=tokenizer.nextToken();
                    year=StringToInt(tokenizer.nextToken());
                    Song c=new Song(id,name,location,author,year);
                    this.add(c);
                }
                if(strbuffer.startsWith("Movie: ")) {
                    strbuffer = strbuffer.replace("Movie: ", "");
                    String id, name, location, author;
                    int year;
                    id=strbuffer;
                    name=tokenizer.nextToken();
                    location=tokenizer.nextToken();
                    author=tokenizer.nextToken();
                    year=StringToInt(tokenizer.nextToken());
                    Movie m = new Movie(id, name, location, author, year);
                    this.add(m);
                }

            }

        } catch (FileNotFoundException | InvalidDataException e) {
            e.printStackTrace();
        }

    }
}
