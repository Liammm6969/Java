import java.util.Scanner;

public class Quiz1 {
	public static void main (String [] args){
	/**Selling price = (1/(1 - margin)) * cost
		where:
		margin = percent of increase
		cost = cost of an item.**/
		
	Scanner input = new Scanner (System.in);
	
		double margin;
		double cost;

		System.out.print("Enter Cost: ");
		cost = input.nextDouble();
		
		System.out.print("Enter Margin: ");
		margin = input.nextDouble();
		
			
			double x = margin / 100;
			double SellingPrice = (1/(1 - x))*cost; //1500
			
			System.out.print("Selling price: " +SellingPrice);
			
			
			
	}
}