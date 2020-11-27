import java.text.DecimalFormat;

public class Dealer extends Employee {
    private int provision;
    private Efficiency efficiency;
    private static final int MIN_PROVISION = 0;

    public Dealer(String firstName, String lastName, int age, int experience, Efficiency efficiency, int provision, Address address) {
        super(firstName, lastName, age, experience, address);
        setEfficiency(efficiency);
        setProvision(provision);
    }

    public void setEfficiency(Efficiency efficiency) {
        if (efficiency != Efficiency.NISKA && efficiency != Efficiency.SREDNIA && efficiency != Efficiency.WYSOKA) {
            throw new IllegalArgumentException("Incorrect efficiency value");
        }
        this.efficiency = efficiency;
    }

    public void setProvision(int provision){
        if (provision < MIN_PROVISION) {
            throw new IllegalArgumentException("Incorrect provision value");
        }
        this.provision = provision;
    }

    public Efficiency getEfficiency(){
        return efficiency;
    }

    public float getCorporationValue(){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String str = decimalFormat.format((float)super.getExperience() * (float)this.efficiency.getEfficiencyValue());
        return Float.parseFloat(str);
    }

    public int getProvision() {
        return provision;
    }
}

