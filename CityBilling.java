import java.util.Scanner;
public class CityBilling {
	public static void main (String []args){
		Scanner input = new Scanner (System.in);
		
		double gallons1;
		System.out.println("Enter Gallons Used ");
		gallons1 = input.nextDouble();
		
		double waterCharge = ((gallons1 * 1.2)/ 100)/100;
		System.out.println("Water Charge " + waterCharge);
		
		double sewerCharge = (gallons1 / 100) / 100;
		System.out.println("Sewer Charge  " + sewerCharge);
		
		double cityTax = (waterCharge + sewerCharge) * 0.02;
		System.out.println("City Tax: " + waterCharge);
		
		double totalBill = waterCharge + sewerCharge + cityTax;
		System.out.println("Total Bill: " + cityTax);
		
		
		
	
		
		
		
	}
}
