package level4.test;

public enum EmployeeType {
    FULL_TIME(1.0),
    CONTRACT(0.8),
    INTERN(0.5);

    private final double abjust;

    EmployeeType(double abjust) {
        this.abjust = abjust;
    }

    public double getAbjust() {
        return abjust;
    }

    public static double adjustBaseSalary(EmployeeType employeeType, double baseSalary){
        double result = 0.0;
        switch (employeeType){
            case FULL_TIME :
                result = FULL_TIME.abjust * baseSalary;
                break;
            case CONTRACT :
                result = CONTRACT.abjust * baseSalary;
                break;
            case INTERN :
                result = INTERN.abjust * baseSalary;
                break;
        }
        return result;
    }
}
