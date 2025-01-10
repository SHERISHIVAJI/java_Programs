package ajp.lab4;
/*
Define a class with method to calculate the product of given parameters using the method overloading.(overload the method to calculate product for different set/type of parameters).
*/

class ProductOfParameters {
	
	//calculate the two integers' product
	void calculateProduct(int num1, int num2) {
		int res = num1 * num2;
		System.out.println("Product of parameters is: " + res);
	}

	
	//calculate the three integers' product
	void calculateProduct(int num1, int num2, int num3) {
		int res = num1 * num2 * num3;
		System.out.println("Product of parameters is: " + res);
	}

	//calculate the four integers' product
	void calculateProduct(int num1, int num2, int num3, int num4) {
		int res = num1 * num2 * num3 * num4;
		System.out.println("Product of parameters is: " + res);
	}

	//calculate the two floating-points product
	void calculateProduct(double num1, double num2) {
		double res = num1 * num2;
		System.out.println("Product of parameters is: " + res);
	}

	//calculate the three floating-points product
	void calculateProduct(double num1, double num2, double num3) {
		double res = num1 * num2 * num3;
		System.out.println("Product of parameters is: " + res);
	}

	//calculate the four floating-points product
	void calculateProduct(double num1, double num2, double num3, double num4) {
		double res = num1 * num2 * num3 * num4;
		System.out.println("Product of parameters is: " + res);
	}

	public static void main(String args[]) {
		ProductOfParameters pop = new ProductOfParameters();
		pop.calculateProduct(10, 20);
		pop.calculateProduct(10, 20, 30);
		pop.calculateProduct(10, 20, 12, 23);
		pop.calculateProduct(10, 20.4);
		pop.calculateProduct(10, 20.90, 7.12);
		pop.calculateProduct(10, 20, 0, 123);
	}
}
