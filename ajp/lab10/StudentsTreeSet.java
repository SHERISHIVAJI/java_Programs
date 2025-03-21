/*
 WAP to  add student names into the set using TreeSet.
*/
package ajp.lab10;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentsTreeSet {
	
	public static void main(String[] args) {
		// Creating a TreeSet to store student names (which will automatically be sorted)
        Set<String> studentNames = new TreeSet<>();
        
        Scanner scanner = new Scanner(System.in);
        
        // Asking the user how many student names they want to add
        System.out.print("Enter the number of students: ");
        int nos = scanner.nextInt();
        scanner.nextLine();
        
        // Adding student names to the TreeSet
        for (int i = 0; i < nos; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            studentNames.add(name);  // Add the name to the TreeSet
        }
        
        // Display the sorted student names
        System.out.println("\nSorted student names:");
    	System.out.println("**********************************");
        for (String name : studentNames)
            System.out.println(name);
    	System.out.println("**********************************");
    	
        scanner.close();
	}

}
