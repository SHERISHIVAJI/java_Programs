package core.exceptionHandling;

public class StringIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		String name="Shivaji";
		try {
			String subName=name.substring(2,8);
			System.out.println("Try block executed!!!");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("Caught an exception...");
			System.err.println(e);
		}
	}
}
