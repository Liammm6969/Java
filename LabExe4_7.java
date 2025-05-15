import java.util.*;
public class LabExe4_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		
		do{
			System.out.println("Enter word or phrase: ");
			String word = sc.nextLine();
			System.out.println("Enter a letter to ignore: ");
			String letter = sc.nextLine();
			
			String newWord = "";
			for(int i = 0; i<word.length();i++){
				if(!String.valueOf(word.charAt(i)).equalsIgnoreCase(letter)){
					newWord += word.charAt(i);
				}
			}
			
			System.out.println("Result: "+newWord);
			System.out.println("Try Again? [Y/N]");
			answer = sc.nextLine();
		}while (answer.equalsIgnoreCase("y"));

	}

}
