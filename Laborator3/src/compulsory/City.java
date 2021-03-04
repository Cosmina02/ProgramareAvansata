package compulsory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "City{ \nName:" + cityName +
                "\nnodes=" + nodes +
                "\n}";
    }
}
