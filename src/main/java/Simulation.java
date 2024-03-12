public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    Dice dice = new Dice();
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    public int runSimulation() {
        int total = 0;
        for (int i = 0; i < numberOfTosses; i++) {
            total += dice.rollDice(numberOfDice);
            System.out.println("Dice total:  " + total);
            total = 0;
        }
        return total;
    }
}
