
package operator;

public class UnaryOperator {

	// Unary operator

	// Increment Operator: ++
	// PreIncrement: ++a
	// PostIncrement: a++

	// Decrement Operator: --
	// PreDecrement: --a
	// PostDecrement: a--

	public static void main(String[] args) {
		int a = 10;
	
		System.out.println(a);
		++a;
		System.out.println(a);
		a++;
		System.out.println(a);
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		--a;
		System.out.println(a);
		a--;
		System.out.println(a);
		--a;
		a++;
		System.out.println(a);
		
		int c = 20;
		int b = 5 * c++;
		
		++b;
		System.out.println(a);
	}

}