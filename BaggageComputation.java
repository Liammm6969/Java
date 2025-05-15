import java.util.Scanner;

public class BaggageComputation {
	

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String zone ;
		double baggageCharge;
		
		int baggageWeight = 0;
		System.out.println("Enter bagggage weight ");
		baggageWeight = input.nextInt();
		System.out.println("Enter Zone ");
		zone = input.next();
		
		if(baggageWeight==1){
			if(zone.equals("A")){
				System.out.println("Baggage Charge 1.01");
			}
			else if (zone.equals("B")){
				System.out.println("Baggage Charge 1.52");
			}
			else if (zone.equals("C")){
				System.out.println("Baggage Charge 1.65");
			}
			else if (zone.equals("D")){
				System.out.println("Baggage Charge 1.85");
			}
		}
		if(baggageWeight==3){
			if(zone.equals("A")){
				System.out.println("Baggage Charge 1.58");
			}
			else if (zone.equals("B")){
				System.out.println("Baggage Charge 2.01");
			}
			else if (zone.equals("C")){
				System.out.println("Baggage Charge 2.43");
			}
			else if (zone.equals("D")){
				System.out.println("Baggage Charge 3.05");
			}
		}
		if(baggageWeight==5){
			if(zone.equals("A")){
				System.out.println("Baggage Charge 1.71");
			}
			else if (zone.equals("B")){
				System.out.println("Baggage Charge 2.52");
			}
			else if (zone.equals("C")){
				System.out.println("Baggage Charge 3.11");
			}
			else if (zone.equals("D")){
				System.out.println("Baggage Charge 4.05");
			}
		}
		if(baggageWeight==10){
			if(zone.equals("A")){
				System.out.println("Baggage Charge 2.04");
			}
			else if (zone.equals("B")){
				System.out.println("Baggage Charge 3.12");
			}
			else if (zone.equals("C")){
				System.out.println("Baggage Charge 4.05");
			}
			else if (zone.equals("D")){
				System.out.println("Baggage Charge 5.01");
			}
		}
		if(baggageWeight>10){
			if(zone.equals("A")){
				System.out.println("Baggage Charge 2.52");
			}
			else if (zone.equals("B")){
				System.out.println("Baggage Charge 3.75");
			}
			else if (zone.equals("C")){
				System.out.println("Baggage Charge 5.18");
			}
			else if (zone.equals("D")){
				System.out.println("Baggage Charge 7.25");
			}
		}
	}
}
