import java.util.HashMap;

public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    Dice dice = new Dice();
    Bins bin = new Bins();

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }



    public int runSimulation() {
        int total = 0;
        for (int i = 0; i < numberOfTosses; i++) {
            if (numberOfTosses <= 1) {
                total += dice.rollDice(numberOfDice);
//            System.out.println("Dice total:  " + total);}
                }
            else  {
                total += dice.rollDice(numberOfDice);
//            System.out.println("Dice total:  " + total);
                total = 0;
            }
        }
        return total;
    }
}
