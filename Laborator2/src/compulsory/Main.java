package compulsory;

public class Main {

    public static void main(String[] args) {
        //declaring the Sources and filling them with the information
        //then creating an array of sources
        Source s1 = new Factory();
        Source s2 = new Warehouse();
        Source s3 = new Warehouse();
        s1.setName("S1");
        s2.setName("S2");
        s3.setName("S3");
        Source[] sources = new Source[]{s1, s2, s3};

        //declaring the destinations and filling them with the information
        //then creating an array of destinations
        Destination d1 = new Destination();
        Destination d2 = new Destination();
        Destination d3 = new Destination();
        d1.setName("D1");
        d2.setName("D2");
        d3.setName("D3");
        Destination[] destinations = new Destination[]{d1, d2, d3};

        //creating the supply array
        int[] supply = new int[3];
        supply[0] = 10;
        supply[1] = 35;
        supply[2] = 25;

        //creating the demand array
        int[] demand = new int[3];
        demand[0] = 20;
        demand[1] = 25;
        demand[2] = 25;

        //creating the cost array
        int[][] cost = new int[][]{{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};

        //making the problem and filling it's variables with the above values
        Problem pb = new Problem();

        pb.setSources(sources);
        pb.setDestinations(destinations);
        pb.setSupply(supply);
        pb.setDemand(demand);
        pb.setCost(cost);

        System.out.println(pb.toString());
        Solution s=new Solution(cost);
        Algoritm al=new Algoritm();
        al.solve(pb,s);
        System.out.println("Costul total este: "+s.getTotalCost());
    }
}
