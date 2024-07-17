package example.vehicles;

public enum VehicleType {
    CAR(100, 4){
        @Override
        public String getFuelType(){
            return "가솔린";
        }
    },
    TRUCK(50, 4){
        @Override
        public String getFuelType(){
            return "디젤";
        }
    },
    MOTORCYCLE(200, 2){
        @Override
        public String getFuelType(){
            return "가솔린";
        }
    },
    BICYCLE(250, 2){
        @Override
        public String getFuelType(){
            return "없음";
        }
    };

    private final int maxSpeed;
    private final int numWheels;

    VehicleType(int maxSpeed, int numWheels) {
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }
    

    public abstract String getFuelType();
}
