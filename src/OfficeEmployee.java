import java.text.DecimalFormat;

public class OfficeEmployee extends Employee {
    private static int staticId = 1;
    private int officeId;
    private int intellect;
    private static final int MIN_INTELLECT = 70;
    private static final int MAX_INTELLECT = 150;

    public OfficeEmployee(String firstName, String lastName, int age, int experience, int intellect, Address address) {
        super(firstName, lastName, age, experience, address);
        this.officeId = OfficeEmployee.staticId;
        OfficeEmployee.staticId++;
        setIntellect(intellect);
    }

    public void setIntellect(int intellect) {
        if (intellect < MIN_INTELLECT || intellect > MAX_INTELLECT) {
            throw new IllegalArgumentException("Incorrect intellect value");
        }
        this.intellect = intellect;
    }

    public float getCorporationValue() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format((float)this.intellect * (float)super.getExperience());
        return Float.parseFloat(str);
    }

    public int getOfficeId() {
        return officeId;
    }

    public int getIntellect() {
        return intellect;
    }
}