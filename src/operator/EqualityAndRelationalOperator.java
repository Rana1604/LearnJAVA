package operator;

public class EqualityAndRelationalOperator {

	public static void main(String[] args) {
		// Equality And Relational Operator

		// == Equality
		// != Not Equal
		// > Grater Than
		// >= Grater Than Equal
		// < Less Than
		// <= Less Than Equal

		int number = 555;
		if (number == 55) {
			System.out.println("Number is Equal to 55");
		}

		if (number != 56) {
			System.out.println("Number is not Equal to 55");
		}

		if (number > 56) {
			System.out.println("Number is Grater Than 56");
		}
		if (number >= 56) {
			System.out.println("Number is Grater Than Equal 56");
		}

		if (number < 56) {
			System.out.println("Number is Less Than 56");
		}
		if (number <= 56) {
			System.out.println("Number is Less Than Equal 56");
		}
		if (number <= 555) {
			System.out.println("Number is Less Than Equal 5555");
		}
	}

}