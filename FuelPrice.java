import java.util.Scanner;

public class FuelPrice {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("[1]Super XCS");
		System.out.println("[2]Diesoline");
		System.out.println("[3]Diesel");
		System.out.println("[4]Regular");
		System.out.println("[5]Gas");
		int selection = 0;
		
		System.out.println("Enter your selection ");
		selection = input.nextInt();
		
		double numberOfLiters = 0;
		System.out.println("Enter number of liters ");
		numberOfLiters = input.nextInt();
		
		
		double totalCost = 0;
		if (selection == 1){
			totalCost = numberOfLiters * 68.75;
		}
		else if (selection == 2){
			totalCost = numberOfLiters * 87.25;
		}
		else if (selection == 3){
			totalCost = numberOfLiters * 86.50;
		}
		else if (selection == 4){
			totalCost = numberOfLiters * 65.50;
		}
		else if (selection == 5){
			totalCost = numberOfLiters * 64.75;
		}
		else{
			System.out.println("Type Of Gas Not Available");
		}
		
		System.out.println("Total Cost " + totalCost);
	}
}
