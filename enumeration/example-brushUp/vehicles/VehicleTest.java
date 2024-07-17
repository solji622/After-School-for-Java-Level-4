package example.vehicles;

public class VehicleTest {
    public static void main(String[] args) {

        VehicleType[] vehicleTypes = VehicleType.values();

        for (VehicleType vehicleType : vehicleTypes) {
            System.out.println("차량 종류: " + vehicleType.name()
            + ", 최고 속도: " + vehicleType.getMaxSpeed()
            + ", 바퀴 수: " + vehicleType.getNumWheels()
            + ", 연료: " + vehicleType.getFuelType());
        }

    }
}
