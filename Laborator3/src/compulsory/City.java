package compulsory;

import java.util.*;

public class City {
    private List<Location> nodes;
    private String cityName;

    public City(List<Location> nodes, String cityName) {
        this.nodes = nodes;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Location> getNodes() {
        return nodes;
    }

    public void setNodes(List<Location> nodes) {
        this.nodes = nodes;
    }

    public void addLocation(Location node) {
        nodes.add(node);
    }

    //optional
    public void displayVisitableNotPayable(){
        List <Location>locations=new LinkedList<>();
        for (Location node : nodes) {
            if (node instanceof Visitable && !(node instanceof Payable)) {
                locations.add(node);
            }
        }
        Collections.sort(locations,
                (Location::comparatorByOpeningHour));
        System.out.println("Visitable but not payable locations: ");
        for(int i=0;i<locations.size();i++){
            System.out.println(locations.get(i));
        }

    }
    @Override
    public String toString() {
        return "City{ \nName:" + cityName +
                "\nnodes=" + nodes +
                "\n}";
    }
}
