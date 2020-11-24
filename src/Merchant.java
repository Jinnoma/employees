public class Merchant extends Employee {
    private String efficiency;
    private int commission;


    public Merchant(String firstName, String lastName, int age, String experience, String efficiency, int commission) {
        super(firstName, lastName, age, experience);
        setEfficiency(efficiency);
        this.commission = commission;
    }

    public void setEfficiency(String efficiency) {
        if (efficiency != "niska" || efficiency != "średnia" || efficiency != "wysoka") {
            throw new IllegalArgumentException("Incorrect efficiency value");
        }
        this.efficiency = efficiency;
    }

}
