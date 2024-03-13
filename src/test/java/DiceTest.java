import org.junit.Assert;
import org.junit.Test;
public class DiceTest {

    @Test
    public void randomNumberGeneratorTest() {
        Dice dice = new Dice();

        boolean expectedRandomNumber = dice.randomNumberGenerator() <= 6;

        Assert.assertTrue(expectedRandomNumber);

    }

    @Test
    public void rollDiceTest() {
        Dice dice = new Dice();

        boolean expectedDiceRoll = dice.rollDice(2) <= 12;

        Assert.assertTrue(expectedDiceRoll);
    }
}
