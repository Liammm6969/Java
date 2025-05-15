import java.util.Scanner;

public class Ifsample {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int grade;
		System.out.println("Enter Grade: " );
		grade = input.nextInt();
		//boolean passedOrFailed = grade >=75;
		
		if(grade > 75){
			System.out.print("PASSED");
		}
		else if(grade == 75){
			System.out.println("APAGPASA");
		}
		
		else {
			System.out.print("FAILED");
		}
		
	}
}
