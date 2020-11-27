public enum Efficiency {
    NISKA(60),
    WYSOKA(120),
    SREDNIA(90);

    private final int efficiency;

    Efficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public int getEfficiencyValue(){
        return this.efficiency;
    }
}
