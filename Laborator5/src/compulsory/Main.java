package compulsory;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, InvalidDataException {
        Catalog c=new Catalog();
        c.setName("My catalog");
        c.setPath("C:\\Users\\cosmi\\OneDrive\\Desktop\\facultate\\sem2\\pa\\Laborator5\\out.txt");
        Movie m=new Movie("1","My movie","C:\\Users\\cosmi\\OneDrive\\Desktop\\facultate\\sem2\\tweb\\proiect", "Maria",2001);
        Song s=new Song("2","My song","https://www.youtube.com/watch?v=YnopHCL1Jk8","Ozone",2003);
        c.add(m);
        c.add(s);
        c.list();
        c.play(1);
        c.play(0);
        c.save(c);
        //the catalog filled with the method load
        Catalog cat=new Catalog();
        cat.load("C:\\Users\\cosmi\\OneDrive\\Desktop\\in.txt");
        cat.list();
    }
}
