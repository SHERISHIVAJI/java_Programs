package ajp.lab5;

/*
Define an Interface Performance with methods action() and award(). Define a class Actor which implements interface Performance and provide implementation the abstract methods in this class
*/

interface Performance {
	void action();

	void award();
}

class Actor implements Performance {
	public void action() {
		System.out.println("Actor performs a dramatic scene on stage.");
	}

	public void award() {
		System.out.println("Actor wins the 'Best Actor' award for an outstanding performance.");
	}
}

public class PerformanceTest {
	public static void main(String args[]) {
		// Creating an object of the Actor class
		Performance actor = new Actor();

		// Calling methods from the Performance interface implemented by Actor
		actor.action(); // Actor performs action
		actor.award(); // Actor wins an award
	}
}