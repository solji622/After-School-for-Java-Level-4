package example.seasons;

public enum Season {
    WINTER(10),
    SPRING(20),
    SUMMER(30),
    FALL(40);
    private final int AverageTemperature;

    Season(int averageTemperature) {
        this.AverageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return AverageTemperature;
    }
}

