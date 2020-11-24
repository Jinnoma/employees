public class Main {
    public static void main(String args[]) {

        Object emp;
        Address address = new Address("Augusta", 12, 13, "Gdynia");
        OfficeEmployee employee = new OfficeEmployee("Przemek", "Guzek", 11, 1, 123, 70, address);
        Registry registry = new Registry();
        registry.addEmployee(employee);
        emp = registry.getEmployee(0);
        emp.getFirstName();

    }
}
