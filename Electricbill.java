import java.util.Scanner;
public class Electricbill {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);{

			double presentReading;
			double previousReading;
			double kilowattUsed;
			double amountDue;
			double modulo;
			int build;
			System.out.println("* Building Code * ");
			System.out.println("<1> - Residential <2> -  Commercial <3> - Industrial ");
			
			System.out.print("Enter your choice: ");
			build =input.nextInt();
			
			System.out.print("Enter Present Reading: ");
			presentReading = input.nextDouble();
			System.out.print("Enter Previous Reading: ");
			previousReading = input.nextDouble();
			kilowattUsed = presentReading -previousReading;
			
			
			switch(build){
			case 1:
				if (kilowattUsed <50){
					System.out.print("Amount due: 27 ");}
				else if	(kilowattUsed >50 && kilowattUsed<100){
					modulo = kilowattUsed % 50;
					amountDue= 27 +(modulo*0.75);
				System.out.print("Amount Due: " + amountDue);}
				else if	(kilowattUsed >100 && kilowattUsed<150){
					modulo = kilowattUsed % 100;
					amountDue= 27 +(modulo*3.50);
				System.out.print("Amount Due: " + amountDue);}
				else if	(kilowattUsed >150){
					modulo = kilowattUsed % 150;
					amountDue= 27 +(modulo*5.50);
				System.out.print("Amount Due: " + amountDue);}
				
			break;
			case 2:
				if (kilowattUsed <50){
					System.out.print("Amount due: 35 ");}
				else if	(kilowattUsed >50 && kilowattUsed<100){
					modulo = kilowattUsed % 50;
					amountDue= 35 +(modulo*0.75);
				System.out.print("Amount Due: " + amountDue);}
				else if	(kilowattUsed >100 && kilowattUsed<150){
					modulo = kilowattUsed % 100;
					amountDue= 35 +(modulo*3.50);
				System.out.print("Amount Due: " + amountDue);}
				else if	(kilowattUsed >150){
					modulo = kilowattUsed % 150;
					amountDue= 35 +(modulo*5.50);
				System.out.print("Amount Due: " + amountDue);}
				
			break;
			case 3:
				if (kilowattUsed<50){
					System.out.print("Amount due: 52 ");}
				else if	(kilowattUsed >50 && kilowattUsed<100){
					modulo = kilowattUsed % 50;
					amountDue= 52 +(modulo*0.75);
				System.out.print("Amount Due: " + amountDue);}
				else if	(kilowattUsed >100 && kilowattUsed<150){
					modulo = kilowattUsed % 100;
					amountDue= 52 +(modulo*3.50);
				System.out.print("Amount Due: " + amountDue);}
				else if	(kilowattUsed >150){
					modulo = kilowattUsed % 150;
					amountDue= 52 +(modulo*5.50);
				System.out.print("Amount Due: " + amountDue);}
				
			break;
		
		default:
			System.out.println("Building Code Invalid");
			break;
		
		
		}

}}}