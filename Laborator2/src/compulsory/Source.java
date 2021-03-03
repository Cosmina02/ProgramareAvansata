package compulsory;

import java.util.Objects;

abstract class Source {

    public String name;
    public String sourceType;
    public Source() {
    }

    public Source(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                '}';
    }
//optional
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Source)) return false;
        Source source = (Source) o;
        return getName().equals(source.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
