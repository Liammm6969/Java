import java.util.*;
public class DressCode {


	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		String dayOfTheWeek;
		System.out.println("Enter what day today is: ");
		dayOfTheWeek = input.next();
		
		switch (dayOfTheWeek){
		default:
			System.out.println("Error!");
			break;
	
		case "Wednesday":
			System.out.println("Dress Down");
			break;
		
		case "Friday":
			System.out.println("Recognized Shirts, Students are not allowed inside the campus.");
			break;
		case "Saturday":
			System.out.println("Dress Down");
			break;
		case "Sunday":
			System.out.println("Recognized Shirts,  Students are not allowed inside the campus.");
			break;
		
		}
	}

}
