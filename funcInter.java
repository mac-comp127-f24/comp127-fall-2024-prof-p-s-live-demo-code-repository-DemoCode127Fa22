// Java program to demonstrate lambda expressions to
// implement a user defined functional interface.
@FunctionalInterface
interface Square {
	int calculate(int y);
}

class funcInter {
	public static void main(String args[])
	{
		int a = 5;

		// lambda expression to define the calculate method
		Square s = (int y) -> y * y;
		// Square y = (int x) -> x * x * x;
		// System.out.println(s);

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}
// * A defining characteristic of closures are the arrow you see after a data type.
// * They are meant to format something for a later time.
// * They help us create a separation of concerns and a division of labor.
// * A closure gives access to an outer function's scope from an inner one.
// * 
// * Some closures are single parameter or double parameter.
// * 
// * As programmers, we can decide what the closure does however the outer method gets
// * to decide what to do with the closure. Someone else can control when it runs.
// */
