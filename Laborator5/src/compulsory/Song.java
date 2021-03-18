package compulsory;

public class Song extends Item{
    private String id;
    private String name;
    private String location;
    private String author;
    private int releaseYear;

    public Song(String id, String name, String location,String author,int releaseYear)throws InvalidDataException {
        if(id==null)throw new InvalidDataException("ID");
        this.id = id;
        if(name==null)throw new InvalidDataException("Name");
        this.name = name;
        if(location==null)throw new InvalidDataException("Location");
        this.location = location;
        if(author==null)throw new InvalidDataException("Author");
        this.author=author;
        if(releaseYear>2021) throw new InvalidDataException("Year");
        this.releaseYear = releaseYear;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", author='" + author + '\'' +
                ", releaseYear=" + releaseYear +
                "}\n";
    }
}
