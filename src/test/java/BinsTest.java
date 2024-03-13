import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void binsConstructorTest() {
        Bins bin = new Bins(2);

        int expectedBinValue = 0;
        int actualBinValue = bin.getBin(2);

        Assert.assertEquals(expectedBinValue, actualBinValue);

    }

    @Test
    public void incrementBinTest() {
        Bins bin = new Bins(2);
        bin.incrementBin(2);
        boolean expectedResult = bin.getBin(2) == 1;

        Assert.assertTrue(expectedResult);
    }

    @Test
    public void getBinTest() {
        Bins bin = new Bins(3);

        int expectedBin = 0;

        int actualBin = bin.getBin(18);

        Assert.assertEquals(expectedBin, actualBin);
    }
}
