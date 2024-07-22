package level4.test;

public class InternEmployee implements Employee {
    double baseSalary;

    InternEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.adjustBaseSalary(EmployeeType.INTERN, baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.INTERN;
    }

    @Override
    public String toString() {
        return "InternEmployee{baseSalary=" + baseSalary
                +", employeeType=" + getEmployeeType()
                +"}";
    }
}
