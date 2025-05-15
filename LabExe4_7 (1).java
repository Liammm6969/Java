import java.util.*;
public class LabExe4_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String loop;
		do{
		String sentence = "";
		String word = "";
		
		System.out.println("Enter word or phrase: ");
		sentence = input.nextLine().toLowerCase();
		
		System.out.println("Enter letter to ignore: ");
		char letter = input.nextLine().toLowerCase().charAt(0);
		
		String result = sentence.replaceAll(Character.toString(letter),"").toUpperCase();
		System.out.println(result);
		
		System.out.println()

		System.out.print("Try Again? [Y/N] ");
		loop = input.nextLine().toUpperCase();
		}while(loop.equals("Y"));
	}

}

		

	
