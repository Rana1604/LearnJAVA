package controlflow;

public class UseIfElseIf {
	// If..Else If ..else

	public static void main(String[] args) {

		int testScore = 0 ;
		String grade;

		if (testScore > 90) {
			grade = "A";
		} else if (testScore > 80) {
			grade = "B";
		} else if (testScore > 70) {
			grade = "C";
		} else if (testScore > 60) {
			grade = "D";
		} else if (testScore >= 60) {
			grade = "X";
		} else if (testScore == 60) {
			grade = "Y";
		} else {
			grade = "F";
		}
		System.out.println("Your Grade is " + grade);

	}

}