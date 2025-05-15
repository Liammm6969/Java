import java.util.*;
public class LabExe4_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
	        String sentence;
	        String reversed;
	           	   
	        System.out.print("enter a word: ");
	        sentence = input.nextLine();
	        
	      
	        sentence = sentence.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        reversed = new StringBuilder(sentence).reverse().toString();
	        
	       
	        if (sentence.equals(reversed)) {
	            System.out.println("it is a palindrome.");
	        } else {
	            System.out.println("it is not a palindrome.");
	        }
	}
}
		
