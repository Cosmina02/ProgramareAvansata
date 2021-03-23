package optional;

public class InvalidCommandException extends Exception{
//throws an exception if the wrong command is given
    public InvalidCommandException(){
        super("Invalid Command");
    }
}
