package level4.test;

public class FullTimeEmployee implements Employee{
    double baseSalary;
    double bonus;

    FullTimeEmployee(double baseSalary, double bonus){
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return EmployeeType.adjustBaseSalary(EmployeeType.FULL_TIME, baseSalary) + bonus;
    }

    @Override
    public EmployeeType getEmployeeType() {
        return EmployeeType.FULL_TIME;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{baseSalary=" + baseSalary
                + ", bonus=" + bonus
                + ", employeeType=" + getEmployeeType()
                +"}";
    }
}
