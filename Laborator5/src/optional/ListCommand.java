package optional;

import compulsory.Catalog;

public class ListCommand {
    public void list(Catalog c){
        System.out.println("The name of the catalog is "+c.getName());
        System.out.println("The path of the catalog is "+c.getPath());
        System.out.println("The items found in the catalog: "+c.items.toString());
    }
}
