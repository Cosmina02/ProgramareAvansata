package compulsory;
//optional
public class Solution {
    public int [][] sol; //how many units Si supply to Dj
    private int [][] cost;
    public Solution(int[][] cost) {
        this.cost = cost;
    }

    public void setSol(int[][] sol) {
        this.sol = sol;
    }

    public int getTotalCost()
    {
        int Totalcost=0;
       for(int i=0;i<sol.length;i++)
           for(int j=0;j< sol.length;j++)
               Totalcost=Totalcost+sol[i][j]*cost[i][j];

       return Totalcost;
    }

}
