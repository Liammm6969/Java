import java.util.*;
public class SwitchArithmetic {


	public static void main(String[] args) {
		//A - add
		//B - subtract
		//C - multiply
		//D - divide
		Scanner input = new Scanner (System.in);
		String option;
		int firstNumber, secondNumber, answer;
		
		System.out.println("Enter first number: ");
		firstNumber = input.nextInt();
		
		System.out.println("Enter second number: ");
		secondNumber = input.nextInt();
		
		System.out.println("Enter option: ");
		System.out.println("A: Addition: ");
		System.out.println("B: Subtraction");
		System.out.println("C: Multiplication");
		System.out.println("D: Division");
		option = input.next();
		
		//.toUpperCase - automatically converts letters into capital letters
		switch(option.toUpperCase()){
		case "A":
			answer = firstNumber+secondNumber;
			System.out.println("The answer is: " +answer);
			break;
		case "B":
			answer = firstNumber-secondNumber;
			System.out.println("The answer is: " +answer);
			break;
		case "C":
			answer = firstNumber*secondNumber;
			System.out.println("The answer is: " +answer);
			break;
		case "D":
			answer = firstNumber/secondNumber;
			System.out.println("The answer is: " +answer);
			break;
		default:
			System.out.println("Error!");
			
		}
	}

}
