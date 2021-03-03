package compulsory;
//optional
public class Algoritm {
    public void solve(Problem pb,Solution s) {
        int[] supply;
        int[] demand;
        int[][] cost;
        supply = pb.getSupply();
        demand = pb.getDemand();
        cost = pb.getCost();
        int m= supply.length;
        int[][] sol=new int [m][m];
        for(int i=0;i<m;i++)
            for(int j=0;j<m;j++)
                sol[i][j]=0;
        int minim, n = 0, i = 0;
        while (i < supply.length) {
            minim = 1000;
            //calculam minimul de pe fiecare linie si salvam coloana aferenta minimului
            for (int j = 0; j < supply.length; j++)
                if (cost[i][j] < minim) {
                    minim = cost[i][j];
                    n = j;
                }
            //comparam supply si demand pentru a umple matricea solutie
            checkSupply(supply, demand, sol, n, i);
            if (supply[i] > 0) {
                //daca sursa nu a ramas goala
                //dam catre destinatia care are cea mai mare nevoie(demand maxim)
                int maxim = 0;
                for (int j = 0; j < demand.length; j++)
                    if (demand[j] > maxim) {
                        maxim = demand[j];
                        n = j;
                    }
                checkSupply(supply, demand, sol, n, i);

            }
            i++;
        }
        s.setSol(sol);
    }

    private void checkSupply(int[] supply, int[] demand, int[][] sol, int n, int i) {

     // in toate cazurile de mai jos umplem matricea cu valorile corespunzatoare
        // daca supply este mai mare decat demand,dam cat este nevoie
        //apoi scadem atat din supply(cat a dat) cat si din demand(cat a primit)
        if (supply[i] > demand[n]) {
            sol[i][n] = sol[i][n] + demand[n];
            supply[i] = supply[i] - demand[n];
            demand[n] = 0;
        } else {
            //daca supply este mai mic decat demand,dam atat cat are
            //apoi scadem din cele doua ca mai sus
            if (supply[i] < demand[n]) {
                sol[i][n] = sol[i][n] + supply[i];
                demand[n] = demand[n] - supply[i];
                supply[i] = 0;
            } else {
                //la fel si daca cele doua sunt egale
                sol[i][n] = sol[i][n] + supply[i];
                demand[n] = 0;
                supply[i] = 0;
            }
        }
    }
}
