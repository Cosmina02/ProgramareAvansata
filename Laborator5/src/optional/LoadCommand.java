package optional;

import compulsory.Catalog;
import compulsory.InvalidDataException;
import compulsory.Movie;
import compulsory.Song;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class LoadCommand {
    private int StringToInt(String str){
        int result = 0;
        for (int i =0; i < str.length(); i++){
            char digit = (char)(str.charAt(i) - '0');
            result += (digit * Math.pow(10, (str.length() - i - 1)));

        }
        return result;
    }
    public void load(Catalog c,String path) throws IOException {
        try {
            String data ="";
            data = new String(Files.readAllBytes(Paths.get(path)));//gets the data from the file
            StringTokenizer tokenizer = new StringTokenizer(data, "\r\n"); //splits the text into tokens
            String strbuffer=tokenizer.nextToken();
            //adds the data in the catalog
            c.setName(strbuffer);
            strbuffer=tokenizer.nextToken();
            c.setPath(strbuffer);
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
                    Song s=new Song(id,name,location,author,year);
                    c.add(s);
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
                    c.add(m);
                }

            }

        } catch (FileNotFoundException | InvalidDataException e) {
            e.printStackTrace();
        }

    }
}
