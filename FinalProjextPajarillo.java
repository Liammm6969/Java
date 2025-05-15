import java.util.*;

import javax.swing.*;
public class FinalProjextPajarillo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nick;
		System.out.println("Enter Nickname: ");
		nick = input.next();
		System.out.println("Welcome " +nick);
		String loop;
		int project;
		String program;
		System.out.println("1. Printing");
		System.out.println("2. DATA TYPES, VARIABLES AND OPERATORS");
		System.out.println("3. GETTING DATA FROM KEYBOARD	");
		System.out.println("4. CONTROLLED STRUCTURE");
		System.out.println("5. CONTROLLED STRUCTURE - SWITCH");
		System.out.println("6. REPETITION CONTROL STRUCTURE");
		System.out.println("Enter Number: ");
		project = input.nextInt();
		String letter;
		
		switch (project){
		case 1:
			System.out.println("PRINTING");
			System.out.println("a. Slumbook.java");
			System.out.println("b. FaceTime.java");
			System.out.println("c. DreamHouse.java");
			System.out.println("Enter letter: ");
			letter = input.next();
			
			if(letter.equals("a")){
				System.out.println("Slumbook.java");
				System.out.println("ABOUT ME:");
				System.out.println("First Name: Mark William");
				System.out.println("Last Name: Pajarillo");
				System.out.println("Middle Name: N/A");
				System.out.println("Age: 17");
				System.out.println("Birthday: September 21, 2004");
				System.out.println("Address: Maddela, Quirino");
				System.out.println("Contact Number: 09397374249");
				System.out.println("Motto: If you're not a good shot today, don't worry. There are other ways to be useful");
				
				System.out.println("FAVORITES:");
				System.out.println("Food: Bicol Express, Sizzling Sisig");
				System.out.println("Color: Pastel Colors");
				System.out.println("Song: OPM");
				System.out.println("Movie: The Greatest Showman");
				System.out.println("Describe Yourself: Mirthful");
			}
			else if(letter.equals("b")){
				System.out.println("FaceTime.java");
				System.out.println("         #xxxxx#");
				System.out.println("        #xxxxxxx#");
				System.out.println("       #xxxxxxxxx#");
				System.out.println("       #xxxxxxxxx#");
				System.out.println("       #xxxxxxxxx#");
				System.out.println("     #xxxxxxxxxxxxx#");
				System.out.println("    #xxxxxxxxxxxxxxx#");
				System.out.println("   #xxxx  xxxxx  xxxx#");
				System.out.println("  #xxxx   xxxxx   xxxx#");
				System.out.println(" #xxxxx   xxxxx   xxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxx###############xxxx#");
				System.out.println("#xxxx#             #xxxx#");
				System.out.println(" #xxxx#           #xxxx#");
				System.out.println("   #xxx#         #xxx#");
				System.out.println("    #xxxx#      #xxxx#");
				System.out.println("      #xxxxxxxxxxxx#");
				System.out.println("      #xxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxxx#");
				System.out.println("#xxxxxxxxxxxxxxxxxxxxxxxx#");
			}
			else if(letter.equals("c")){
				System.out.println("DreamHouse.java");
				System.out.println("                                                      ---                 ");
				System.out.println("                                                     |   |              ");	
				System.out.println("                                                     |   |              ");
				System.out.println("                          *----------------------------------*       ");
				System.out.println("                         *  **                                **");
				System.out.println("                        *   ***                               ***");
				System.out.println("                       **     ****                              ****");
				System.out.println("                      **          ******                            *** ");
				System.out.println("                    ***                *****                           | ");
				System.out.println("                   |---------------------------------------------------|");
				System.out.println("                   |                _____        ============          | ");
				System.out.println("                   |               |     |      |------------|         |"); 
				System.out.println("                   |               |     |      |------------|         |");
				System.out.println("                   |        ____    -----       |------------|         |");
				System.out.println("                   |       |    |               |------------|         |");
				System.out.println("                   |       |   o|               |------------|         |");
				System.out.println("                   |_______|____|_______________|____________|_________|");
				System.out.println("                           0    0               o============o          ");
				System.out.println("                           0    0               o            o          ");
				System.out.println("                           0    0               o            o          ");
				System.out.println("                           0    0               o            o          ");
				System.out.println("                           0    0               o            o          ");
				System.out.println("                           0    0               o            o          ");
			}
			break;
		case 2:
			System.out.println("DATA TYPES, VARIABLES AND OPERATORS");
			System.out.println("a. AreaOfATriangle.java");
			System.out.println("b. CelciusToFarenheit.java");
			System.out.println("c. GradeToAverage.java");
			System.out.println("d. MultiplyFifteen.java");
			System.out.println("Enter Letter: ");
			letter = input.next();
			
			if(letter.equals("a")){
				System.out.println("AreaOfATriangle.java");
				double b = 15.7;
				double h = 33.6;
				
				double area = (b*h)/2;
				System.out.println ("Area of a triangle = " + area);
			}
			else if(letter.equals("b")){
				System.out.println("CelciusToFarenheit.java");
				double C = 58.3;
				double F = 0;
				
				double fahrenheit = (C * 1.8)+ 32;
				System.out.println ("Celsius to Fahrenheit = " + fahrenheit);
			}
			else if(letter.equals("c")){
				System.out.println("GradeToAverage.java");
				double English = 87.5;
				double Math = 76.3;
				double Science = 82.7;
				double Filipino = 88.43;
				double History = 94.77;
				
				double Grade = (English + Math + Science + Filipino + History) / 5;
				System.out.println ("Grade Average =" + Grade);
			}
			else if(letter.equals("d")){
				System.out.println("MultiplyFifteen.java");
				int multiple1 = 15;
				int multiple2 = multiple1 * 1;
				int multiple3 = multiple1 * 2;
				int multiple4 = multiple1 * 3;
				int multiple5 = multiple1 * 4;
				int multiple6 = multiple1 * 5;
				int multiple7 = multiple1 * 6;
				int multiple8 = multiple1 * 7;
				int multiple9 = multiple1 * 8;
				int multiple10 = multiple1 * 9;
				int multiple11 = multiple1 * 10;

				
				System.out.println("1 times 15 = " + multiple1);
				System.out.println("2 times 15 = " + multiple1);
				System.out.println("3 times 15 = " + multiple1);
				System.out.println("4 times 15 = " + multiple1);
				System.out.println("5 times 15 = " + multiple1);
				System.out.println("6 times 15 = " + multiple1);
				System.out.println("7 times 15 = " + multiple1);
				System.out.println("8 times 15 = " + multiple1);
				System.out.println("9 times 15 = " + multiple1);
				System.out.println("10 times 15 = " + multiple1);
			}
			break;
		case 3:
			System.out.println("GETTING DATA FROM KEYBOARD");
			System.out.println("a.Slumbook2.java");
			System.out.println("b.Arithmetic.java");
			System.out.println("Enter Letter: ");
			letter = input.next();
			
			if(letter.equals("a")){
				System.out.println("Slumbook2.java");
				String FirstName;
				String LastName;
				String MiddleName;
				int age;
				String Birthday;
				
				String Address;
				int ContactNumber;
				
				String Motto;
				String Food;
				String Color;
				String Song;
				String Movie;
				String DescribeYourself;
				
				System.out.println("ABOUT ME: ");
				System.out.print("First Name: ");
				FirstName = input.next();
				System.out.print("Last Name: ");
				LastName = input.next();
				System.out.print("Middle Name: ");
				MiddleName = input.next();
				System.out.print("Age: ");
				age = input.nextInt();
				System.out.print("Birthday: ");
				Birthday = input.next();
				System.out.print("Adress: ");
				Address = input.next();
				System.out.print("Contact Number: ");
				ContactNumber = input.nextInt();
				System.out.print("Motto: ");
				Motto = input.next();
				System.out.println("FAVORITES");
				System.out.print("Food: ");
				Food = input.next();
				System.out.print("Color: ");
				Color = input.next();
				System.out.print("Song: ");
				Song = input.next();
				System.out.print("Movie: ");
				Movie = input.next();
				System.out.print("Describe Yourself: ");
				DescribeYourself = input.next();
			}
			else if(letter.equals("b")){
				System.out.println("CelciusToFarenheit");
				double C = 58.3;
				double F = 0;
				
				double fahrenheit = (C * 1.8)+ 32;
				System.out.println ("Celsius to Fahrenheit = " + fahrenheit);
			}
			else if(letter.equals("c")){
				System.out.println("GradeToAverage");
				double English = 87.5;
				double Math = 76.3;
				double Science = 82.7;
				double Filipino = 88.43;
				double History = 94.77;
				
				double Grade = (English + Math + Science + Filipino + History) / 5;
				System.out.println ("Grade Average =" + Grade);
			}
			else if(letter.equals("d")){
				System.out.println("MultiplyFiftee");
				int multiple1 = 15;
				int multiple2 = multiple1 * 1;
				int multiple3 = multiple1 * 2;
				int multiple4 = multiple1 * 3;
				int multiple5 = multiple1 * 4;
				int multiple6 = multiple1 * 5;
				int multiple7 = multiple1 * 6;
				int multiple8 = multiple1 * 7;
				int multiple9 = multiple1 * 8;
				int multiple10 = multiple1 * 9;
				int multiple11 = multiple1 * 10;

				
				System.out.println("1 times 15 = " + multiple1);
				System.out.println("2 times 15 = " + multiple1);
				System.out.println("3 times 15 = " + multiple1);
				System.out.println("4 times 15 = " + multiple1);
				System.out.println("5 times 15 = " + multiple1);
				System.out.println("6 times 15 = " + multiple1);
				System.out.println("7 times 15 = " + multiple1);
				System.out.println("8 times 15 = " + multiple1);
				System.out.println("9 times 15 = " + multiple1);
				System.out.println("10 times 15 = " + multiple1);
			}
			break;
		case 4:
			System.out.println("CONTROLLED STRUCTURE");
			System.out.println("a. QuentelexIndex.java");
			System.out.println("b. HuttValleyEnergy.java");
			System.out.println("c. FuelPrice.java");
			System.out.println("Enter Letter: ");
			letter = input.next();
		switch(letter){
		case "a":System.out.println("QuentelexIndex.java");
		int weight = 0;
		double height = 0;
		
		System.out.print("Enter weight: ");
		weight = input.nextInt();
		System.out.print("Enter height: ");
		height = input.nextDouble();
		double queteletIndex = weight / (height*height);
		System.out.println("Quetelet Index: " +queteletIndex);

		if (weight <20){
			System.out.println("Remarks  Underweight");
		}
		else if(weight <= 25){
			System.out.println("Remarks Healthy weight");
		}
		else if(weight <= 30){
			System.out.println("Remarks Midly overweight");
		}
		else if(weight <= 40){
			System.out.println("Remarks Very overweight");
		}
		else if(weight > 40){
			System.out.println("Remarks Extremely overweight");
		break;
		}
		case "b":System.out.println("HuttValleyEnergy.java");
		int kilowattHours = 0;
	
		
		System.out.println("Enter meter reading ");
		kilowattHours = input.nextInt();
		double totalCost = 0;
		
		if (kilowattHours <= 500 ){
			totalCost = 10;
		}
		else if (kilowattHours >=501 && kilowattHours <=1000){
			totalCost = 10 + ((kilowattHours-500)* 0.05);
		}
		else if( kilowattHours > 1000){
			totalCost = 35 + ((kilowattHours-1000) * 0.03);
		}
		System.out.println("Total Charge/Cost is " + totalCost);
		break;
		}
		switch(letter){
		case "c":System.out.println("FuelPrice.java");
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
		
		
		double totalCost1 = 0;
		if (selection == 1){
			totalCost1 = numberOfLiters * 68.75;
		}
		else if (selection == 2){
			totalCost1 = numberOfLiters * 87.25;
		}
		else if (selection == 3){
			totalCost1 = numberOfLiters * 86.50;
		}
		else if (selection == 4){
			totalCost1 = numberOfLiters * 65.50;
		}
		else if (selection == 5){
			totalCost1 = numberOfLiters * 64.75;
		}
		else{
			System.out.println("Type Of Gas Not Available");
		}
		
		System.out.println("Total Cost " + totalCost1);
		break;
		
		}
		break;
		case 5:
			System.out.println("CONTROLLED STRUCTURE - SWITCH");
			System.out.println("a. ElectBrill.java");
			System.out.println("b. DressCode.java");
			System.out.println("c. CarRental.java");
			System.out.println("d. Rock.java");
			System.out.println("Enter Letter: ");
			letter = input.next();
			
			switch(letter){
			case "a":System.out.println("ElectricBill.java");
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
			break;
			case "b":System.out.println("DressCode.java");
			int Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
			String dayOfTheWeek;
			System.out.println("Enter what day today is: ");
			dayOfTheWeek = input.next();
			
			switch (dayOfTheWeek){
			default:
				System.out.println("Error!");
				break;
		
			case "Wednesday":
				System.out.println("Dress Down");
				break;
			
			case "Friday":
				System.out.println("Recognized Shirts, Students are not allowed inside the campus.");
				break;
			case "Saturday":
				System.out.println("Dress Down");
				break;
			case "Sunday":
				System.out.println("Recognized Shirts,  Students are not allowed inside the campus.");
				break;
			
			}
			break;
			case "c":System.out.println("CarRental.java");
			int typeOfCar;
			int numberOfDays;
			int milesTravelled;
			int insuranceType;
			double totalDailyCharge=0;
			double totalMileageCharge=0;
			double totalInsuranceCost=0;
			double totalCost=0;
		s
			
			System.out.println("Enter Type of Car: ");
			typeOfCar = input.nextInt();
			System.out.println("Enter Number of Days: ");
			numberOfDays = input.nextInt();
			System.out.println("Enter Miles Travelled: ");
			milesTravelled = input.nextInt();
			System.out.println("Insurance Type: ");
			insuranceType = input.nextInt();
			
			if(typeOfCar == 1 ){
				totalDailyCharge = numberOfDays * 8;
				totalMileageCharge = milesTravelled * 0.06;
			}
			else if(typeOfCar == 2){
				totalDailyCharge = numberOfDays * 10;
				totalMileageCharge = milesTravelled * 0.08;
			}
			else if(typeOfCar == 3){
				totalDailyCharge = numberOfDays * 15;
				totalMileageCharge = milesTravelled * 0.12;
			}
			else 
			{
				System.out.println("Car type not Available. ");
			}
			if (insuranceType == 1){
				totalInsuranceCost = (totalDailyCharge + totalMileageCharge)*.20;
			}
			else if(insuranceType == 2){
				totalInsuranceCost = numberOfDays * 4;
			}
			else{
				System.out.println("Insurance not available: ");
			}
			
			totalCost = totalDailyCharge + totalMileageCharge + totalInsuranceCost;
			System.out.println("The total cost is: " +totalCost);
			break;
			}
			break;
			switch(letter){
			case "d":System.out.println();
		}
	
	}}}
	

	

