package adding;
import java.util.Scanner;

 class add {
	public static void main(String[] args) {
		sub subObject = new sub();
		subObject.Substraction(); 
		/*
		 * This where you called the two classes together
		 *  I made two class:
		 *  add.java and sub.java
		 *  At the top of my code it said "sub subObject = new sub();"
		 *  							   "subObject.Substraction();"
		 *  Essentially Im calling the sub.java class into the add java class
		 *  The Substraction is the main function of the sub java class
		 *  
		 *  
		 */
		int x, y, result;

		x = STDIN_SCANNER.nextInt();
		y = STDIN_SCANNER.nextInt();

		result = x + y;

		System.out.print(result);
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
