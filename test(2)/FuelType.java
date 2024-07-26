public enum FuelType {
    GASOLINE(0.8),
    DIESEL(0.9),
    ELECTRIC(0.95);

    private final double efficiency;

    FuelType(double efficiency) {
        this.efficiency = efficiency;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public double calculateRequiredFuel(Double distance){
        return distance * efficiency;

    }
}
