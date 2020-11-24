public class Worker extends Employee {
    private int strength;


    public Worker(String firstName, String lastName, int age, String experience, int strength) {
        super(firstName, lastName, age, experience);
        this.strength = strength;
    }

    public void setStrength(int strength) {
        if (strength < 0 || strength > 100) {
            throw new IllegalArgumentException("Incorrect strength value");
        }
        this.strength = strength;
    }

}
