
public class Main {
    public static void main(String args[]) {

        Employee emp;
        Address address = new Address("Augusta", 12, 13, "Gdynia");
        OfficeEmployee employee = new OfficeEmployee("Przemek", "Guzek", 11, 1, 70, address);
        Workman employee1 = new Workman("Przemek", "Guzek", 11, 1, 70, address);
        Registry registry = new Registry();
        registry.addEmployee(employee);
        registry.addEmployee(employee1);
        employee = (OfficeEmployee) registry.getEmployee(1);
        System.out.println(employee.getId());
    }
}

