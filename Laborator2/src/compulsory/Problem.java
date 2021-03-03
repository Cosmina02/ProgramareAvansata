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
        //creates the problem only if the sources and the destinations have different names
        try {
            checkSources(sources);
            checkDestination(destinations);
            this.sources = sources;
            this.destinations = destinations;
            this.supply = supply;
            this.demand = demand;
            this.cost = cost;
        }
        catch(IllegalArgumentException e)
        {
            e.printStackTrace();
        }
    }

    public Source[] getSources() {
        return sources;
    }

    public void setSources(Source[] sources) {
        try{
            checkSources(sources);
            this.sources = sources;
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public void setDestinations(Destination[] destinations) {
        try{
            checkDestination(destinations);
            this.destinations = destinations;
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
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
//optional
    //checks if there are 2 destinations or sources with the same name
    //if it finds 2 destinations or sources with the same name it throws an exception
    public void checkDestination(Destination[] destinations){
        for(int i=0;i<destinations.length;i++)
            for(int j=i+1;j< destinations.length;j++)
                if(destinations[i].equals(destinations[j]))
                    throw new IllegalArgumentException("Cannot have two destinations with the same name!");
    }

    public void checkSources(Source[] sources){
        for(int i=0;i< sources.length;i++)
            for(int j=i+1;j< sources.length;j++)
                if(sources[i].equals(sources[j]))
                    throw new IllegalArgumentException("Cannot have two sources with the same name!");
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
