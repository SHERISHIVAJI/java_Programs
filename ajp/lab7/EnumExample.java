/*
 * Write a java program using using a enum and print the values of enum.
 */

package ajp.lab7;

public class EnumExample {
	// Defining the enum with some values in it
	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
		// Print all the values of the Day enum
		System.out.println("Days of the Week:");
		
		// Iterate through each constant in the Day enum
		for (Day day : Day.values()) {
            System.out.println(day);
        }
	}

}
