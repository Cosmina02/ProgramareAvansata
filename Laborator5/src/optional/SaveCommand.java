package optional;

import compulsory.Catalog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveCommand {
    public void save(Catalog cat) throws IOException {

        try (var oos = new ObjectOutputStream( new FileOutputStream(cat.getPath()))) {
            oos.writeObject(cat);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
