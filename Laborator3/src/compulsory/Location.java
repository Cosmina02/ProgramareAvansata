package compulsory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Location
{
    private String name;
    private Map<Location, Integer> cost = new HashMap<>();//a map with the locations and the cost from location A to location B

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Location, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Location, Integer> cost) {
        this.cost = cost;
    }

    public void setCost(Location node, int value) {
        cost.put(node, value);
    }

    public static int comparatorByOpeningHour(Location a,Location b){
        if(a instanceof Visitable && b instanceof Visitable)
            return ((Visitable) a).getOpeningTime().compareTo(((Visitable) b).getOpeningTime());
        return 0;
    }

    @Override
    public String toString() {
        return "\nLocation{" +
                "name='" + name + '\'' +
                ", cost=" + convertWithStream(cost) +
                "}";
    }
    //returning the values that are in the map as string
    public String convertWithStream(Map<Location,Integer> map) {
        return map.keySet().stream()
                .map(key -> key + "=" + map.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
    }
}
