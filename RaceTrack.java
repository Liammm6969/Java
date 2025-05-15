import java.util.Scanner;
public class RaceTrack {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int time,loc;
		
		System.out.println("Enter positive time in seconds: ");
		time = input.nextInt();
		
		loc = time % 140;
		
		
		if (loc <= 30){
			System.out.println("The car is in the CONCRETE section");
			
		}
		else if(loc > 30 && loc <= 75){
			System.out.println("The car is in the MUD section");
		}
		
		if (loc > 75 && loc <=100){
			System.out.println("The car is in the ASPHALT section");
			
		}
		else if (loc >=140){
			System.out.println("The car is in the SAND section");
		}
		
		
		
		
		
		
		
		 
		
		
		
		
	}
}
