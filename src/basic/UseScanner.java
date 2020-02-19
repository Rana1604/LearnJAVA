package basic;

import java.util.Scanner;

public class UseScanner {
 // need to know about case sensitive
	public static void main(String[] args) {
		Scanner nameInput = new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = nameInput.nextLine();
		System.out.println("My Name is " + name);

		Scanner ageInput = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age = ageInput.nextInt();
		System.out.println("My Age is " + age);
		nameInput.close();


	}
}