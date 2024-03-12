import java.util.HashMap;

public class Bins {
   private HashMap<Integer, Integer> bin = new HashMap<>();

   Simulation sim = new Simulation(2, 100);
   public Bins(HashMap<Integer, Integer> bin) {
       this.bin = bin;
   }

   public Bins() {

   }

//    public int trackResults(int numberOfTosses) {
//       int timesRolled = 0;
//       Integer newBin = null;
//       for (int i = 0; i < numberOfTosses; i++) {
//           newBin = bin.put(sim.runSimulation(), timesRolled++);
//       }
//       return newBin;
//    }
}
