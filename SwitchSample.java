import java.util.*;
public class SwitchSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/**int grade;
		
		System.out.println("Enter a grade: ");
		grade = input.nextInt();
		
		switch(grade){
		case 100:
			System.out.println("Perfect!");
			break;
		case 75:
			System.out.println("Congrats!");
			break;
		case 60:
			System.out.println("Try again bawi next life!");
			break;
		default:
			System.out.println("Nice!");
			break;
		}**/
		
		String fruits;
		
		System.out.println("Enter fruit: ");
		fruits = input.next();
		
		switch(fruits){
		case "apple":
			System.out.println("20 pesos per piece");
			break;
		case "banana":
			System.out.println("5 pesos per piece");
			break;
		case "orange":
			System.out.println("15 pesos per piece");
			break;
		default:
			System.out.println("Fruit not available");
			break;
		
		}

	}

}
