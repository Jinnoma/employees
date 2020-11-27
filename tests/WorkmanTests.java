import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorkmanTests {

    private Workman workman;

    @Before
    public void setup() {
        Address workerAddress = new Address("Augusta", 12, 13, "Gdynia");
        workman = new Workman("Przemek", "Guzek", 30, 3, 100, workerAddress);
    }

    @Test
    public void getWorkmanCorporationValue() {
        /* value = experience * strength / age */
        float corporationValue;
        corporationValue = workman.getCorporationValue();
        assertEquals(10, corporationValue, 2);
    }
}
