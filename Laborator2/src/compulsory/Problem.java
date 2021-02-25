package compulsory;

import java.util.Arrays;

public class Problem {
    private Source[] sources;
    private Destination[] destinations;

    private int[] supply;
    private int[] demand;
    private int[][] cost;

    public Problem() {
    }

    public Problem(Source[] sources, Destination[] destinations, int[] supply, int[] demand, int[][] cost) {
        this.sources = sources;
        this.destinations = destinations;
        this.supply = supply;
        this.demand = demand;
        this.cost = cost;
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        this.sources = sources;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }

    public int[] getSupply() {
        return supply;
    }

    public void setSupply(int[] supply) {
        this.supply = supply;
    }

    public int[] getDemand() {
        return demand;
    }

    public void setDemand(int[] demand) {
        this.demand = demand;
    }

    public int[][] getCost() {
        return cost;
    }

    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Problem{\n" +
                "sources=" + Arrays.toString(sources) +
                "\ndestinations=" + Arrays.toString(destinations) +
                "\nsupply=" + Arrays.toString(supply) +
                "\ndemand=" + Arrays.toString(demand) +
                "\ncost=" + Arrays.deepToString(cost) +
                '}';
    }
}