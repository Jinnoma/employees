import java.text.DecimalFormat;

public class Workman extends Employee {
    private int strength;
    private static final int MIN_STRENGTH = 1;
    private static final int MAX_STRENGTH = 100;


    public Workman(String firstName, String lastName, int age, int experience, int strength, Address address) {
        super(firstName, lastName, age, experience, address);
        setStrength(strength);
    }

    public void setStrength(int strength) {
        if (strength < MIN_STRENGTH || strength > MAX_STRENGTH) {
            throw new IllegalArgumentException("Incorrect strength value");
        }
        this.strength = strength;
    }

    public float getCorporationValue() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format((float) super.getExperience() * (float) this.strength / (float) super.getAge());
        return Float.parseFloat(str);
    }
}
