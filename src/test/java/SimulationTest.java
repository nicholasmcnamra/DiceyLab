import org.junit.Assert;
import org.junit.Test;

import java.time.temporal.ValueRange;

public class SimulationTest {
    @Test
    public void runSimulationTwoTest() {
        Simulation sim = new Simulation(2, 10);
        sim.runSimulation();

        boolean expectedResults = sim.results.getBin(2) <= 10;

        Assert.assertTrue(expectedResults);
    }

    @Test
    public void runSimulationThreeTest() {
        Simulation sim = new Simulation(3, 100);
        sim.runSimulation();

        boolean expectedResults = sim.results.getBin(12) <= 100;

        Assert.assertTrue(expectedResults);
    }
}
