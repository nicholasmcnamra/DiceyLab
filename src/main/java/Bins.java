import java.util.HashMap;

public class Bins {
   private HashMap<Integer, Integer> results = new HashMap<>();

   Simulation sim = new Simulation(2, 100);
   public Bins(int numberOfDice) {
      for (int i = numberOfDice; i <= numberOfDice*6; i++) {
         results.put(i, 0);
      }
   }
   public Bins() {
   }
}
