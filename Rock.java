import java.util.*;
public class Rock {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		String play;
		System.out.println("Enter your play: R, P, or S");
		play = input.next();
		
		Random rndm = new Random();
		int max = 3;
		int value = rndm.nextInt(max);
	
		switch (play.toUpperCase()){
		case "R":
			if ( value == 1 ){
			System.out.println("Computer play is: R");
			System.out.println("It's a tie!");
			}
			else if ( value == 2){
				System.out.println("Computer play is: P");
				System.out.println("Paper covers Rock. You Lose!");
			}
			else if ( value == 3){
				System.out.println("Computer play is: S");
				System.out.println("Rock crushes Scissor. You Win!");
			}
			break;
		case "P": 
			if (value == 1 ){
			System.out.println("Computer play is: R");
			System.out.println("Paper covers Rock. You won!");
			}
			else if (value == 2){
				System.out.println("Computer Play is: P");
				System.out.println("It's a tie!");
			}
			else if (value == 3){
				System.out.println("Computer Play is: S");
				System.out.println("Scissor cuts Paper. You lose!");
			}
			break;
		case "S":
			if ( value == 1 ){
			System.out.println("Computer play is: R");
			System.out.println("Rock crushes Scissor. You lose!");
			}
			else if (value == 2){
				System.out.println("Computer play is: P");
				System.out.println("Scissor cuts paper. You Win!");
			}
				else if (value == 3){
					System.out.println("Computer play is: S");
					System.out.println("It's a tie!");
				}
			break;
			}
		
		
		}
		

		
	}


