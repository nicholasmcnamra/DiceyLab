public class Dice {

    public Dice() {

    }

    public int rollDice(int numberOfDice) {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += randomNumberGenerator();
        }
        return sum;
    }

    public int randomNumberGenerator() {
        int randomNumber = (int) ((6.0 * Math.random()) + 1);
        return randomNumber;
    }
}
