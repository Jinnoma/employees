import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTests {

    private Dealer dealer;

    @Before
    public void setup() {
        Address dealerAddress = new Address("Augusta", 12, 13, "Gdynia");
        dealer = new Dealer("Przemek", "Guzek", 11, 1, Efficiency.NISKA, 70, dealerAddress);
    }

    @Test
    public void getDealerCorporationValue() {
        /* corporationValue = experience * efficiency */
        float corporationValue;
        corporationValue = dealer.getCorporationValue();
        assertEquals(60, corporationValue, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setIncorrectProvisionValue() {
        dealer.setProvision(-1);
    }

}
