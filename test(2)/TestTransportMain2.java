public class TestTransportMain2 {
    public static void main(String[] args) {
        TransportManager<Car> carManager = new TransportManager<>();
        TransportManager<Bicycle> bicycleManager = new TransportManager<>();
        TransportManager<Train> trainManager = new TransportManager<>();

        Movable[] movables = {new Car(50.0, FuelType.GASOLINE),
            new Bicycle(3), new Train()
        };

        carManager.moveTransport(20.567);
        bicycleManager.moveTransport(10.234);
        trainManager.moveTransport(100.789);

        for (Movable movable : movables) {
            info(movable);
            System.out.println("교통수단 종류: " + movable.getTransportType().getDescription());
            System.out.println("--------------------------------");
        }

    }

    public static void info(Movable movable) {
        switch (movable.getTransportType()) {
            case CAR:
                System.out.println("남은 연료: " + Car.getRemainingFuel());
            case MOTORCYCLE:
                System.out.println("남은 연료: " + Motorcycle.getRemainingFuel());

        }
    }
}
