import java.util.*;

public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    Dice dice = new Dice();
    Bins results;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.results = new Bins(numberOfDice);
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }
    public void runSimulation() {
        int total =0;
        for (int i = 0; i < numberOfTosses; i++) {
            total = dice.rollDice(numberOfDice);
            results.incrementBin(total);
        }
    }

    public void printResults() {
        runSimulation();
        for (int i = numberOfDice; i <= numberOfDice*6; i++) {
            double percentage = ((double) results.getBin(i)/ ((double) numberOfTosses));
                System.out.println(String.format("%-2d :  %,7d  :  %8.2f", i, results.getBin(i), percentage));
        }
    }
}
