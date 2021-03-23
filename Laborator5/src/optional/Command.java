package optional;

import compulsory.Catalog;
import compulsory.InvalidDataException;
import compulsory.Movie;

abstract public class Command {
    String commandName;

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
}
