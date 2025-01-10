package ajp.lab4;
/*
Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. ii.call the location() and famousFor() method by the all subclass’,and print accordingly.
*/

class HillStations {
	void location() {
		System.out.println("This is HillStations location method");
	}

	void famousFor() {
		System.out.println("This is HillStations famousFor method");
	}
}

class Manali extends HillStations {
	void location() {
		System.out.println("This is Manali location method");
	}

	void famousFor() {
		System.out.println("This is Manali famousFor method");
	}
}

class Mussoorie extends HillStations {
	void location() {
		System.out.println("This is Mussoorie location method");
	}

	void famousFor() {
		System.out.println("This is Mussoorie famousFor method");
	}
}

class Gulmarg extends HillStations {
	void location() {
		System.out.println("This is Gulmarg location method");
	}

	void famousFor() {
		System.out.println("This is Gulmarg famousFor method");
	}
}

class HyrarchicalInheritance {
	public static void main(String args[]) {
		HillStations hillStations = new HillStations();
		hillStations.location();
		hillStations.famousFor();

		HillStations hillStations1 = new Manali();
		hillStations1.location();
		hillStations1.famousFor();

		HillStations hillStations2 = new Mussoorie();
		hillStations2.location();
		hillStations2.famousFor();

		HillStations hillStations3 = new Gulmarg();
		hillStations3.location();
		hillStations3.famousFor();

		Manali manali = new Manali();
		manali.location();
		manali.famousFor();

		Mussoorie mussoorie = new Mussoorie();
		mussoorie.location();
		mussoorie.famousFor();

		Gulmarg gulmarg = new Gulmarg();
		gulmarg.location();
		gulmarg.famousFor();

	}
}