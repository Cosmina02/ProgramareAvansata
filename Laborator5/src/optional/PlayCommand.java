package optional;

import compulsory.Catalog;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class PlayCommand {
    public void play(Catalog c,int index) throws IOException, URISyntaxException {
        try {
            if (c.items.get(index).getLocation().contains("C:")||c.items.get(index).getLocation().contains("d:")) {
                File file = new File(c.items.get(index).getLocation());
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try {
            if (c.items.get(index).getLocation().contains("https:")) {
                URI uri = new URI(c.items.get(index).getLocation());
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(uri);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
