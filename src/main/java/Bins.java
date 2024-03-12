import java.util.HashMap;

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
   public void incrementBin(int bin) {
      try {
      results.put(bin, results.get(bin) + 1);
////         results.put();
         // NullPointerException I think?
      } catch (Exception e) {
//         results.putIfAbsent()
      }
   }

   // Get amount in bin
   public Integer getBin(int bin) {
//      try {
////         results.get()
//         // NullPointerException I think?
//      } catch (Exception e) {
////         return
//      }
      return results.get(bin);
   }
}
