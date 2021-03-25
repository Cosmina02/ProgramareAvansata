package optional;

import compulsory.Catalog;
import compulsory.InvalidDataException;
import compulsory.Movie;
import compulsory.Song;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class Shell {
    //this method checks which command you typed and then runs the apropriate command
    public static void checkCommandType(String command,Catalog c,Catalog cat,Movie m ,Song s) throws InvalidDataException, IOException, URISyntaxException, InvalidCommandException {


        switch (command){
            case "c add song" -> new AddCommand().add(c,s);
            case "c add movie" ->new AddCommand().add(c,m);
            case "c list" -> new ListCommand().list(c);
            case "c play" ->new PlayCommand().play(c,0);
            case "c load"->new LoadCommand().load(c,"C:\\Users\\cosmi\\OneDrive\\Desktop\\in.txt");
            case "c save"->new SaveCommand().save(c);
            case "cat add song" -> new AddCommand().add(cat,s);
            case "cat add movie" ->new AddCommand().add(cat,m);
            case "cat list" -> new ListCommand().list(cat);
            case "cat play" ->new PlayCommand().play(cat,0);
            case "cat load"->new LoadCommand().load(cat,"C:\\Users\\cosmi\\OneDrive\\Desktop\\in.txt");
            case "cat save"->new SaveCommand().save(cat);
            default->throw new InvalidCommandException();
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name = reader.readLine();
        checkCommandType(name,c,cat,m,s);


    }
    public static void main(String[] args)
            throws IOException, InvalidDataException, URISyntaxException, InvalidCommandException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();
        Catalog cat=new Catalog();
        Catalog c=new Catalog();
        c.setName("My catalog");
        c.setPath("C:\\Users\\cosmi\\OneDrive\\Desktop\\facultate\\sem2\\pa\\Laborator5\\out.txt");
        Movie m=new Movie("1","My movie","C:\\Users\\cosmi\\OneDrive\\Desktop\\facultate\\sem2\\tweb\\proiect", "Maria",2001);
        Song s=new Song("2","My song","https://www.youtube.com/watch?v=YnopHCL1Jk8","Ozone",2003);
        //calls the checkCommand function
        checkCommandType(name,c,cat,m,s);

    }

}
