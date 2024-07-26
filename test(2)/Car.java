public class Car implements Movable{
    private static double fuel;
    private FuelType fueltype;

    public Car(double fuel, FuelType fueltype) {
        this.fuel = fuel;
        this.fueltype = fueltype;
    }

    @Override
    public void move(Double distance) {
        double result = fueltype.calculateRequiredFuel(distance);
        fuel -= result;
        if (result <= distance) {
            System.out.println("자동차가 " + distance + " 만큼 이동했습니다. 남은 연료: " + fuel);
        } else {
            System.out.println(distance + "만큼 이동하기에 연료가 충분하지 않습니다.");
        }
    }

    @Override
    public TransportType getTransportType() {
        return TransportType.CAR;
    }

    public static double getRemainingFuel() {
        return fuel;
    }
}
