import java.util.Scanner;
public class ScannerSample {
	public static void main (String[]args){
		//create a program that will allow the user to input his nickname and ID number 
		//and will show a welcome message to the user
		
		Scanner input = new Scanner(System.in);
		int IDNumber;
		String nickname;
		System.out.print("Enter ID Number: ");
		IDNumber = input.nextInt();
		System.out.print("Enter Nickname: ");
		nickname = input.next();
		
		System.out.print("Welcome "+nickname+"! Your ID number is: "+IDNumber);
		
		
	}
}
