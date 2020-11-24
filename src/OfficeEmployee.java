public class OfficeEmployee extends Employee {
    private int officeId;
    private int intellect;

    public OfficeEmployee(String firstName, String lastName, int age, String experience, int officeId, int intellect) {
        super(firstName, lastName, age, experience);
        this.officeId = officeId;
        setIntellect(intellect);


    }

    public void setIntellect(int intellect) {
        if (intellect < 70 || intellect > 150) {
            throw new IllegalArgumentException("Incorrect intellect value");
        }
        this.intellect = intellect;
    }
}