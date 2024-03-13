import java.util.HashMap;
import java.util.Map;

public class Bins {

   private HashMap<Integer, Integer> results = new HashMap<>();

   public Bins(int numberOfDice) {
       for (int i = numberOfDice; i <= numberOfDice*6; i++) {
         results.put(i, 0);
      }
   }
   public Bins() {
   }

   // Change amount in bin
   public void incrementBin(int binNumber) {
      try {
      results.put(binNumber, results.get(binNumber) + 1);
      } catch (Exception e) {
      }
   }

   // Get value in bin
   public Integer getBin(int bin) {
      try {
         // NullPointerException I think?
      } catch (Exception e) {
//         return
      }
      return results.get(bin);
   }
}
