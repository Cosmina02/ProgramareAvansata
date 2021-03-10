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

    void bubbleSort(Visitable[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getOpeningTime().compareTo(arr[j+1].getOpeningTime())>0)
                {
                    // swap arr[j+1] and arr[j]
                   Visitable temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    //optional
    public void displayVisitableNotPayable(Visitable[] visitables,Payable[] payables){
        boolean notPayable=true;
        Visitable[] visitable=new Visitable[visitables.length- payables.length];
        int t=0;
        for(int i=0;i< visitables.length;i++) {
            notPayable=true;
            for (int j = 0; j < payables.length; j++)
                if (visitables[i] == payables[j]) {
                    notPayable = false;
                    break;
                }
            if(notPayable)
            {
                visitable[t]=visitables[i];
                t++;
            }
        }
    bubbleSort(visitable);
        for(int i=0;i< visitable.length;i++)
            System.out.println(" "+visitable[i]);


    }
    @Override
    public String toString() {
        return "City{ \nName:" + cityName +
                "\nnodes=" + nodes +
                "\n}";
    }
}
