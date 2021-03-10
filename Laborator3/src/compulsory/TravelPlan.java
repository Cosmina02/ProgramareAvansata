package compulsory;

import java.util.LinkedList;
import java.util.List;

//optional

public class TravelPlan {
   private City cityName;
   private List<Location> preferences=new LinkedList<>();

   public TravelPlan(City cityName, List<Location> preferences) {
      this.cityName = cityName;
      this.preferences = preferences;
   }

   @Override
   public String toString() {
      return "TravelPlan{" +
              "cityName=" + cityName +
              ", preferences=" + preferences +
              '}';
   }
}
