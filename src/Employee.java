public abstract class Employee {

    private static int employeeId = 1;
    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private int experience;
    private Address address;

    public Employee(String firstName, String lastName, int age, int experience, Address address) {
        this.id = Employee.employeeId;
        Employee.employeeId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
        this.address = address;
    }

    public void setCity(String city) {
        address.setCity(city);
    }

    public void setStreet(String street) {
        address.setStreet(street);
    }

    public String getCity() {
        return address.getCity();
    }

    public String getStreet() {
        return address.getStreet();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getExperience() {
        return experience;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public int getId() {
        return id;
    }

    public abstract float getCorporationValue();

    public static void setEmployeeId(int employeeId) {
        Employee.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
