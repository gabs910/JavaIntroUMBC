package examples;

public class TestAndOr {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if ((num1 < 10) && (num2++ == 21)) {
			System.out.println((" in if " + num1 + " " + num2 ));
		} else {
			System.out.println(" in else " +num1 + " " +  num2);
		}

	}

}
