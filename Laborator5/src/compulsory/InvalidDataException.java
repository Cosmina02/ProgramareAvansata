package compulsory;

public class InvalidDataException extends Exception{

    public InvalidDataException(String ex){
       super("Invalid  "+ex);
    }

}
