package optional;

import compulsory.Catalog;
import compulsory.InvalidDataException;
import compulsory.Item;

public class AddCommand extends Command{

    public void add(Catalog c,Item item) throws InvalidDataException {
        if(item==null) throw new InvalidDataException("item");
        c.items.add(item);
    }

}
