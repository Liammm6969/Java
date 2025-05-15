import java.util.Scanner;

public class Arithmetic {
	public static void main ( String [] args){
	Scanner input = new Scanner (System.in);
	//create a program that will accept 2 numbers and will show the sum,
	//difference, product, quotient and modulo of the 2 numbers.

	int n = 0;
	int n2 = 0;
	
	
	System.out.print("Enter first number: ");
	n = input.nextInt();
	System.out.print("Enter second number: ");
	n2 = input.nextInt();

	int sum = (n +n2);
	System.out.println("Sum= "+  sum);
	
	int difference = (n-n2);
	System.out.println("Difference= " +difference);
	
	int product = (n*n2);
	System.out.println("Product= " +product);

	int quotient = (n/n2);
	System.out.println("Quotient= " +quotient);
	
	int modulo = (n%n2);
	System.out.println("Modulo= " +modulo);
	}
}
