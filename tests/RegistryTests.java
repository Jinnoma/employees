import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RegistryTests {

    private Registry registry;
    private OfficeEmployee officeEmployee;
    private Dealer dealer;
    private Workman workman;

    @Before
    public void setup() {
        registry = new Registry();
        Address officeEmployeeAddress = new Address("Augusta", 12, 13, "Gdynia");
        Address dealerAddress = new Address("Kościuszki", 1, 8, "Sopot");
        Address workmanAddress = new Address("10 Lutego", 112, 10, "Gdynia");
        officeEmployee = new OfficeEmployee("Przemek", "Guzek", 25, 1, 70, officeEmployeeAddress);
        dealer = new Dealer("Adam", "Kowalski", 35, 8, Efficiency.SREDNIA, 8, dealerAddress);
        workman = new Workman("Jan", "Nowak", 55, 15, 70, workmanAddress);
        Employee.setEmployeeId(1);
    }

    @Test
    public void removeEmployee() {
        int result;
        registry.addEmployee(workman);
        registry.addEmployee(dealer);
        registry.addEmployee(officeEmployee);
        registry.removeEmployee(1);
        result = registry.getRegistryLen();
        assertEquals(result, 2);
    }

    @Test
    public void addEmployee() {
        int result;
        registry.addEmployee(officeEmployee);
        result = registry.getRegistryLen();
        assertEquals(result, 1);
    }

    @Test
    public void addAllEmployeesType() {
        int result;
        registry.addEmployee(workman);
        registry.addEmployee(dealer);
        registry.addEmployee(officeEmployee);
        result = registry.getRegistryLen();
        assertEquals(result, 3);
    }

    @Test
    public void getEmployeesByCity() {
        ArrayList<String> emp;
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jan Nowak", "Przemek Guzek"));
        registry.addEmployee(workman);
        registry.addEmployee(dealer);
        registry.addEmployee(officeEmployee);
        emp = registry.getEmployeesByCity("Gdynia");
        Assert.assertEquals(emp, names);
    }

    @Test
    public void sortEmployees() {
        List<String> emp;
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jan Nowak, Experience: 15",
                "Adam Kowalski, Experience: 8",
                "Przemek Guzek, Experience: 1",
                "Przemek Guzek, Age: 25",
                "Adam Kowalski, Age: 35",
                "Jan Nowak, Age: 55",
                "Przemek Guzek, Name: Guzek",
                "Adam Kowalski, Name: Kowalski",
                "Jan Nowak, Name: Nowak"));
        registry.addEmployee(workman);
        registry.addEmployee(dealer);
        registry.addEmployee(officeEmployee);
        emp = registry.sortEmployees();
        Assert.assertEquals(emp, names);

    }

    @Test
    public void getEmployeesCorporationValue() {
        List<String> emp;
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jan Nowak, corporation Value: 19.09",
                "Adam Kowalski, corporation Value: 720.0",
                "Przemek Guzek, corporation Value: 70.0"));
        registry.addEmployee(workman);
        registry.addEmployee(dealer);
        registry.addEmployee(officeEmployee);
        emp = registry.getEmployeesWithCorpValue();
        Assert.assertEquals(emp, names);
    }
}
