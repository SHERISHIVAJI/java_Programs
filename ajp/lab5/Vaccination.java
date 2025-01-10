package ajp.lab5;

/*
Create abstract class vaccine.Create two variables age(int),nationality(String).create 2 concrete methods firstDose() and secondDose(). Scenario 1:user can take the first dose if the user is Indian and age is 18.After vaccination the user has to pay 250rs(which will be displayed on the console). Scenario 2: Users are eligible to take the second dose only after completing the first dose. Scenario 3: create abstract method boosterDose() in abstract class Vaccine.Create one implementation class vaccinationSuccessful, where implement boosterDose() method. Create main class vaccination and invoke all methods accordingly. [Hint:Create constructor to initialize variables age and nationality,Use flow control(Ifelse) to check condition]
*/

abstract class Vaccine {
	int age;
	String nationality;

	public Vaccine(int age, String nationality) {
		this.age = age;
		this.nationality = nationality;
	}

	public boolean firstDose() {
		if (nationality.equals("Indian") && age >= 18) {
			System.out.println("User is eligible for the first dose.");
			System.out.println("Payment: 250rs");
			return true;
		} else {
			System.out.println("User is not eligible for the first dose.");
			return false;
		}
	}

	public void secondDose(boolean firstDoseCompleted) {
		if (firstDoseCompleted)
			System.out.println("User is eligible for the second dose.");
		else
			System.out.println("User must complete the first dose before taking the second dose.");
	}

	public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
	public VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
	}

	public void boosterDose() {
		System.out.println("User is eligible for the booster dose after completing the second dose.");
	}
}

public class Vaccination {
	public static void main(String args[]) {
		System.out.println("Scenario-1:");
		// Scenario 1 - Create a user who is eligible for the first dose
		Vaccine user1 = new VaccinationSuccessful(25, "Indian");
		boolean firstDoseCompleted = user1.firstDose();
		user1.secondDose(firstDoseCompleted);
		System.out.println();

		System.out.println("Scenario-2:");
		// Scenario 2 - Create another user who is not eligible for the first dose
		Vaccine user2 = new VaccinationSuccessful(16, "Indian");
		firstDoseCompleted = user2.firstDose();
		user2.secondDose(firstDoseCompleted);
		System.out.println();

		System.out.println("Scenario-3:");
		// Scenario 3 - Implement booster dose
		VaccinationSuccessful successfulUser = new VaccinationSuccessful(30, "Indian");
		firstDoseCompleted = successfulUser.firstDose();
		successfulUser.secondDose(firstDoseCompleted);
		successfulUser.boosterDose();
	}
}
