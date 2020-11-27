import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OfficeEmployeeTests {

    private OfficeEmployee officeEmployee;

    @Before
    public void setup() {
        Address officeEmployeeAddress = new Address("Augusta", 12, 13, "Gdynia");
        officeEmployee = new OfficeEmployee("Przemek", "Guzek", 11, 1, 70, officeEmployeeAddress);
    }

    @Test
    public void getOfficeEmployeeCorporationValue() {
        /* corporationValue = experience * intellect */
        float corporationValue;
        corporationValue = officeEmployee.getCorporationValue();
        assertEquals(70, corporationValue, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTooLowIntellect() {
        officeEmployee.setIntellect(69);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTooHighIntellect() {
        officeEmployee.setIntellect(151);
    }
}
