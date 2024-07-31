import model.Employee;
import service.EmployeeManager;


public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10); // Initial capacity of 10

        // Add Employees
        manager.addEmployee(new Employee("E001", "John Doe", "Developer", 75000));
        manager.addEmployee(new Employee("E002", "Jane Smith", "Manager", 85000));
        manager.addEmployee(new Employee("E003", "Alice Brown", "Analyst", 70000));

        // Traverse Employees
        System.out.println("Employee List:");
        manager.traverseEmployees();

        // Search for an Employee
        System.out.println("\nSearching for Employee ID E002:");
        Employee employee = manager.searchEmployeeById("E002");
        System.out.println(employee != null ? employee : "Employee not found.");

        // Delete an Employee
        System.out.println("\nDeleting Employee ID E001:");
        manager.deleteEmployeeById("E001");

        // Traverse Employees Again
        System.out.println("\nEmployee List After Deletion:");
        manager.traverseEmployees();
    }
}