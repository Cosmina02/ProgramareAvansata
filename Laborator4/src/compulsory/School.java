package compulsory;

public class School implements Comparable{

    private String name;
    private int capacity;

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\nSchool{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(this.name.equals(name))
            return 1;
        else
            return 0;
    }
}

