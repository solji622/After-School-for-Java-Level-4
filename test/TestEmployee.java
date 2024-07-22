package level4.test;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = {new FullTimeEmployee(3000, 500), new ContractEmployee(2500),
         new InternEmployee(1500)};
        EmployeeType[] employeeType = EmployeeType.values();

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeType() + " Employee Salary: " + employee.calculateSalary());
        }

        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }
}