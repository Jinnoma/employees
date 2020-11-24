public class Employee {
    public String firstName;
    private String lastName;
    private int age;
    private String experience;
    private Address address;

    public Employee(String firstName, String lastName, int age, String experience, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
        this.address = address;
    }

    public void setCity(String city){
        address.setCity(city);
    }

    public void setStreet(String street){
        address.setStreet(street);
    }

    public String getCity(String city){
        return address.getCity();
    }
}