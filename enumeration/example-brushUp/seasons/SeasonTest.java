package example.seasons;

public class SeasonTest {
    public static void main(String[] args) {

        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.println("계절: " + season.name() + ", 평균 기온: " + season.getAverageTemperature());
        }

    }
}
