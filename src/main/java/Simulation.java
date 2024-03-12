import java.util.HashMap;

public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    Dice dice = new Dice();
    Bins results = new Bins(numberOfDice);

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }
    public Bins runSimulation() {

        int total = 0;
        for (int i = 0; i < numberOfTosses; i++) {
            total = dice.rollDice(numberOfDice);
            results.incrementBin(total);
        } 
        return results;
    }

}
