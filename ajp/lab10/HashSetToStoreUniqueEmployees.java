/*
WAP to  add  set of Employees into a HashSet to store unique 
Employees based on empId.
*/
package ajp.lab10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {
	private int empId;
	private String empName;
	
	// Constructor to initialize employee details
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
    
    // Overriding hashCode and equals to compare employees by empId
    @Override
    public int hashCode() {
        return Integer.hashCode(empId);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return empId == employee.empId;
    }
    
    // Overriding toString method to print employee details
    @Override
    public String toString() {
        return "Employee ID: " + empId + ", Name: " + empName;
    }
}

public class HashSetToStoreUniqueEmployees {
	public static void main(String[] args) {
        // Create a HashSet to store unique Employee objects
		Set<Employee> empSet = new HashSet<>();
		
        Scanner scanner = new Scanner(System.in);
        
        // Input number of employees to add
        System.out.print("Enter the number of employees to add: ");
        int noe = scanner.nextInt();
        
        // Adding employee details
        for (int i = 0; i < noe; i++) {
            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Enter Employee Name: ");
            String empName = scanner.nextLine();
            
            // Create an Employee object and add it to the HashSet
            Employee employee = new Employee(empId, empName);
            empSet.add(employee);
        }
        
        // Display all employees in the HashSet
        System.out.println("\nList of unique employees (based on empId):");
    	System.out.println("**********************************");
        for (Employee emp : empSet) 
            System.out.println(emp);
    	System.out.println("**********************************");
    	
    	scanner.close();
	}
}
