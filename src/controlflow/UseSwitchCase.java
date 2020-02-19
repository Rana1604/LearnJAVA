package controlflow;

public class UseSwitchCase {

	// Switch Case

	public static void main(String[] args) {

		int menuNumber = 1;
		String dayName;
		//Need to know upper one

		switch (menuNumber) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Pizza";
				break;
			case 4:
				dayName = "Fried Rice";
				break;
			case 5:
				dayName = "French Fry and Cold Drinks";
				break;
			case 6:
				dayName = "Mack & Cheese";
				break;
			default:
				dayName = "Invalid Item";
				break;
		}
		System.out.println("Your Day Name is " + dayName);


	}
}