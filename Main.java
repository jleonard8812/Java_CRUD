public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("John Doe");
        employee1.setSalary(50000.0);

        // Display information about the employee
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee1.getId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
    }
}