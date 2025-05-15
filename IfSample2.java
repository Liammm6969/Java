
import java.util.Scanner;

public class IfSample2 {
	public static void main(String []args){
		Scanner input = new Scanner (System.in);
		String fruit;
		int pieces;
		int totalAmount = 0;
		
		System.out.print("Enter fruit: ");
		fruit = input.next();
		
		if (fruit.equals("apple")){
			System.out.println("Enter pieces: ");
			pieces = input.nextInt();
			totalAmount = pieces * 30;
		}
		else if(fruit.equals("orange")){
			System.out.println("Enter pieces: ");
			pieces = input.nextInt();
			totalAmount = pieces * 15;
		}
		else if(fruit.equals("banana")){
			System.out.println("Enter pieces: ");
			pieces = input.nextInt();
			totalAmount = pieces * 3;
		}
		else{
			System.out.println("Fruit not available.");
		}
		System.out.print("The total amount is: " +totalAmount);
		
	}
}
