package level4.test;

public class ContractEmployee implements Employee {
    double baseSalary;

    ContractEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.adjustBaseSalary(EmployeeType.CONTRACT, baseSalary);
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.CONTRACT;
    }

    @Override
    public String toString() {
        return "ContractEmployee{baseSalary=" + baseSalary
                +", employeeType=" + getEmployeeType()
                +"}";
    }
}
