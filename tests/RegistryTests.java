import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class RegistryTests {

    private Registry registry;
    private Employee officeEmployee;
    private Employee dealer;
    private Employee dealer1;
    private Employee workman;
    private Employee workman1;


    @Before
    public void setup() {
        registry = new Registry();
        Address officeEmployeeAddress = new Address("Augusta", 12, 13, "Gdynia");
        Address dealerAddress = new Address("Kościuszki", 1, 8, "Sopot");
        Address workmanAddress = new Address("10 Lutego", 112, 10, "Gdynia");
        officeEmployee = new OfficeEmployee("Przemek", "Guzek", 38, 1, 70, officeEmployeeAddress);
        dealer = new Dealer("Adam", "Kowalski", 35, 8, Efficiency.SREDNIA, 8, dealerAddress);
        workman = new Workman("Jan", "Nowak", 55, 15, 70, workmanAddress);
        dealer1 = new Dealer("Adam", "Anyszka", 40, 15, Efficiency.SREDNIA, 8, dealerAddress);
        workman1 = new Workman("Janusz", "Nowak", 40, 15, 70, workmanAddress);

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
    public void addManyEmployees() {
        int result;
        registry.addManyEmployees(workman, dealer, officeEmployee);
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
    public void sortEmpByMultiple() {
        /* Exp desc, Age, Name */
        List<String> result;
        List<String> expected = new ArrayList<>(Arrays.asList("Adam Anyszka, Exp: 15, Age: 40, Name: Anyszka",
                "Janusz Nowak, Exp: 15, Age: 40, Name: Nowak",
                "Jan Nowak, Exp: 15, Age: 55, Name: Nowak",
                "Adam Kowalski, Exp: 8, Age: 35, Name: Kowalski",
                "Przemek Guzek, Exp: 1, Age: 38, Name: Guzek"));
        registry.addEmployee(workman);
        registry.addEmployee(workman1);
        registry.addEmployee(dealer);
        registry.addEmployee(dealer1);
        registry.addEmployee(officeEmployee);
        result = registry.sortByMultiple();
        Assert.assertEquals(expected, result);

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
