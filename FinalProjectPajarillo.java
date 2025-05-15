package kunyaremabait;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class FinalsProjectPajarillo{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome!");
	    
	    String user = JOptionPane.showInputDialog(frame, "Enter Name");
	    JOptionPane.showMessageDialog(frame, "Welcome to my Final Project, "+user +"!");
	
	
	{
		try{
		Scanner input = new Scanner(System.in);{
		
			String answer1;
			
			do{
				int project;
				System.out.println("Welcome " +user +"!");	
				System.out.println("[1] PRINTING					[2] DATA TYPES, VARIABLES AND OPERATORS" );	
				System.out.println("[3] GETTING DATA FROM KEYBOARD			[4] CONTROLLED STRUCTURES" );	
				System.out.println("[5] CONTROLLED STRUCTURES(SWITCH)		[6] REPETITION CONTROL STRUCTURE" );	
				System.out.print("Choose a Number: " );	
				
				project = input.nextInt();
				
					
				
					if(project==1){
						do{
							String letter;
							System.out.println("[1] PRINTING(Choose one of the following): " );	
							System.out.println("[A] Slumbook.java: " );
							System.out.println("[B] FaceTime.java " );
							System.out.println("[C] DreamHouse.java " );
							System.out.println("Enter letter: " );	
							letter = input.next().toUpperCase();
							if(letter.equals("A")){
								
							
								System.out.println("ABOUT ME:");
								System.out.println("First user: Mark William");
								System.out.println("Last user: Pajarillo");
								System.out.println("Middle user: N/A");
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
							else if(letter.equals("B")){
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
							else if(letter.equals("C")){
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
							
							System.out.println(" ");
							System.out.print("Go back? Y/N: ");
							answer1 =input.next().toUpperCase();
							}
						while (answer1.equals("Y")); }
						else if(project==2){
							do{
						
								String letter;
								System.out.println("[2] DATA TYPES, VARIABLES AND OPERATORS: " );
								System.out.println("[A] AreaOfATriangle.java: " );
								System.out.println("[B] CelsiusToFahrenheit.java " );
								System.out.println("[C] GradeAverage.java " ); 
								System.out.println("[D] MultiplyFifteen.java " );
								System.out.println("Enter letter: " );	
								letter = input.next().toUpperCase();
							
							if(letter.equals("A")){
								double b = 15.7;
								double h = 33.6;
								
								double area = (b*h)/2;
								System.out.println ("Area of a triangle = " + area);
							}
							else if(letter.equals("B")){
								double C = 58.3;
								double F = 0;
								
								double fahrenheit = (C * 1.8)+ 32;
								System.out.println ("Celsius to Fahrenheit = " + fahrenheit);
							}
							else if(letter.equals("C")){
								double English = 87.5;
								double Math = 76.3;
								double Science = 82.7;
								double Filipino = 88.43;
								double History = 94.77;
								
								double Grade = (English + Math + Science + Filipino + History) / 5;
								System.out.println ("Grade Average =" + Grade);
							}
							else if(letter.equals("D")){

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
							
							System.out.println(" ");
							System.out.print("Go back? Y/N[2]: ");
							answer1 =input.next().toUpperCase();
							}
						while (answer1.equals("Y")); }
				else if(project==3){
					do{
				
						String letter;
						System.out.println("[3] GETTING DATA FROM KEYBOARD: " );	
						System.out.println("[A] Slumbook2.java " );
						System.out.println("[B] Arithmetic.java " );
						System.out.println("Enter letter: " );	
						letter = input.next().toUpperCase() ;
					if(letter.equals("A")){
						String Firstuser;
						String Lastuser;
						String Middleuser;
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
						System.out.print("First user: ");
						Firstuser = input.next();
						System.out.print("Last user: ");
						Lastuser = input.next();
						System.out.print("Middle user: ");
						Middleuser = input.next();
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
					else if(letter.equals("B")){
						int n = 0;
						int n2 = 0;
						
						
						System.out.print("Enter first number: ");
						n = input.nextInt();
						System.out.print("Enter second number: ");
						n2 = input.nextInt();

						int sum = (n +n2);
						System.out.println("Sum= "+  sum);
						
						int difference = (n-n2);
						System.out.println("Difference= " +difference);
						
						int product = (n*n2);
						System.out.println("Product= " +product);

						int quotient = (n/n2);
						System.out.println("Quotient= " +quotient);
						
						int modulo = (n%n2);
						System.out.println("Modulo= " +modulo);
					}
					
					
					System.out.println(" ");
					System.out.print("Go back? Y/N[3]: ");
					answer1 =input.next().toUpperCase();
					}while (answer1.equals("Y"));
				}
					if(project==4){
						do{
							String letter;
							System.out.println("[4] CONTROLLED STRUCTURES: " );
							System.out.println("[A] QuetelexIndex	.java: " );
							System.out.println("[B] HuttValleyEnergy.java " );
							System.out.println("[C] FuelPrice.java " );
							System.out.println("Enter letter: " );	
							letter = input.next().toUpperCase();
							if(letter.equals("A")){
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
								}
							}
							else if(letter.equals("B")){
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

							}
							else if(letter.equals("C")){
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
							
							System.out.println(" ");
							System.out.print("Go back? Y/N[4]: ");
							answer1 =input.next().toUpperCase();
							}
						while (answer1.equals("Y")); }
					
					if(project==5){
						do{
							String letter;
							System.out.println("[5] CONTROLLED STRUCTURES SWITCH: " );	
							System.out.println("[A] ElectricBill.java: " );
							System.out.println("[B] DressCode.java " );
							System.out.println("[C] CarRental.java" );
							System.out.println("[D] Rock.java " );
							System.out.println("Enter letter: " );	
							letter = input.next().toUpperCase();
							if(letter.equals("A")){
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
							}}
							else if(letter.equals("B")){

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
							}
							else if(letter.equals("C")){
								int typeOfCar ;
								double numberOfDays;
								double tNumberOfDays;
								double mileTravelled;
								double tMileTravelled;
								int insuranceType ;
								double insuranceValue ;
								double total;
								
								
								System.out.print(" Type of car : ");
								typeOfCar = input.nextInt();
								
								System.out.print(" Number of day : ");
								numberOfDays = input.nextDouble();
								
								System.out.print(" Miles Travelled : ");
								mileTravelled = input.nextDouble();
								
								System.out.print(" Insurance Type : ");
								insuranceType = input.nextInt();
							
								switch (typeOfCar){
								case 1:
									tNumberOfDays= numberOfDays *8;
									tMileTravelled = mileTravelled *0.06;
									
									if (insuranceType==1){
										insuranceValue =(tNumberOfDays+tMileTravelled)*.20;
										total =tNumberOfDays+tMileTravelled+insuranceValue;
										
										System.out.println(" Total Bill : " +total);
										}
									else if(insuranceType==2){
										
										insuranceValue = numberOfDays * 4;
										total =tNumberOfDays+tMileTravelled+insuranceValue;
										
										System.out.println(" Total Bill : " +total);
										
									}
								break;
								
								case 2:
									tNumberOfDays= numberOfDays *10;
									tMileTravelled = mileTravelled *0.08;
									if (insuranceType==1){
										insuranceValue =(tNumberOfDays+tMileTravelled)*.20;
										total =tNumberOfDays+tMileTravelled+insuranceValue;
										System.out.println(" Total Bill : " +total);
										}
									else if(insuranceType==2){
										insuranceValue = numberOfDays * 4;
										total =tNumberOfDays+tMileTravelled+insuranceValue;
										System.out.println(" Total Bill : " +total);
										
									}
								break;
								case 3:
									tNumberOfDays= numberOfDays *15;
									tMileTravelled = mileTravelled *0.12;
									if (insuranceType==1){
										insuranceValue =(tNumberOfDays+tMileTravelled)*.20;
										total =tNumberOfDays+tMileTravelled+insuranceValue;
										System.out.println(" Total Bill : " +total);
										}
									else if(insuranceType==2){
										insuranceValue = numberOfDays * 4;
										total =tNumberOfDays+tMileTravelled+insuranceValue;
										System.out.println(" Total Bill : " +total);
										
									}
								break;
								default:
									System.out.print("ERROR");
								break;
								
								}
							}
							else if(letter.equals("D")){
								String play;
								System.out.println("Enter your play: R, P, or S");
								play = input.next();
							
								Random rndm = new Random();
								int max =  3;
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
							
							System.out.println(" ");
							System.out.print("Go back? Y/N[5]: ");
							answer1 =input.next().toUpperCase();
							}while (answer1.equals("Y"));} 
					
					 if(project==6){
						do{
							String letter;
							System.out.println("[A] Loop1.java: " );
							System.out.println("[B] Loop2.java " );
							System.out.println("[C] Loop3.java " );
							System.out.println("[D] Loop4.java " );
							System.out.println("[E] UlamSequence.java " );
							System.out.println("[F] NandM.java " );
							System.out.println("[G] Remainders.java " );
							System.out.println("[H] Stars.java " );
							System.out.println("[6] REPETITION CONTROL STRUCTURE(Choose one of the following): " );
						letter = input.next();
						if(letter.equals("A")){
						    int number;
						  	String answer;
						     int i=1;
					
									do	{
									System.out.print("Enter Number: ");
									
									number =input.nextInt();
									

									while(i<=number){
									System.out.print(i);
										i++;
									}
									
									System.out.println(" ");
									System.out.print("Try again? Y/N: ");
									answer =input.next().toUpperCase();
									i=1;
									}while (answer.equals("Y"));

						}
						else if(letter.equals("B")){
							  int number;
							  	String answer;
							     
							      int i=0 ;
									do{ 
										System.out.print("Enter Number: ");
										number =input.nextInt();
										
										while(i<=number){
										System.out.print(number);
										number--;
									
										}
										System.out.println(" ");
										System.out.print("Try again Y/N?: ");
										answer =input.next().toUpperCase();
										i=1;
									}while (answer.equals("Y"));
						}
						else if(letter.equals("C")){
						    int number;
						  	String answer;
						     
						      int i=2;
								do{ 
									System.out.print("Enter Number: ");
									number =input.nextInt();
									while(i<=number){
									System.out.print(i);
									i++;
									i+=1;
									}
									System.out.println(" ");
									System.out.print("Try again Y/N?: ");
									answer =input.next().toUpperCase();
									i=2;
								}while (answer.equals("Y"));
						}
						else if(letter.equals("D")){
							int number;
						  	String answer;
						     
						      int i=1;
								do{ 
									System.out.print("Enter Number: ");
									number =input.nextInt();
									while(i<=number){
									System.out.print(i);
									i++;
									i+=1;
									}
									System.out.println(" ");
									System.out.print("Try again Y/N?: ");
									answer =input.next().toUpperCase();
									i=1;
								}while (answer.equals("Y"));
						}
						else if(letter.equals("E")){
							String answer;
							int number=1 ;

									do{
										System.out.print("Enter a positive integer:  ");
										number = input.nextInt();
										
										while(number!=1){
											int even = number % 2;
											
											if (even == 0){
												number = number /2 ;
											}
										else {
											number= 3 * number + 1;
											}
											System.out.print(number);	System.out.print(" ");
										}
										 number=1 ;
						System.out.println(" ");
						System.out.print("Try again Y/N?: ");
						answer =input.next().toUpperCase();
						}while (answer.equals("Y"));
						}
						
						else if(letter.equals("F")){
							int number;
						  	String answer;
						     
						      int i=2;
								do{ 
									System.out.print("Enter Number: ");
									number =input.nextInt();
									while(i<=number){
									System.out.print(i);
									i++;
									i+=1;
									}
									System.out.println(" ");
									System.out.print("Try again Y/N?: ");
									answer =input.next().toUpperCase();
									i=2;
								}while (answer.equals("Y"));
						}
						else if(letter.equals("G")){
							int n;
							int i=1;
							String answer;
							do{
								
								System.out.print("Enter Positive Number: ");
								n =input.nextInt();
										while(i<=n){
											i++;
											if (i%3==1 && i%4==2 && i%5==3 && i%6==4)
												System.out.print(" " +i);	
										}
								System.out.println(" ");
							System.out.print("Try again Y/N?: ");
							answer =input.next().toUpperCase();
							i=1;
							}
							while (answer.equals("Y"));
						}
						
						else if(letter.equals("H")){
							System.out.println("1");
							for(int s=0; s<4; s++){
								System.out.println("********");
							}
							System.out.println("2");
							int k, e, row=5;
							for(k=0; k<row; k++)
							{
							for(e=0; e<=k; e++)
							{
								System.out.print("**");
							}
								System.out.println();
							}
							
							System.out.println("3");
								int x, f, line=5;
										for(x=0; x<=line; x++)
									{
										for(f=2*(line-x); f>=0; f--)
									{
									
											System.out.print(" ");
									}
									for (f=0; f<=x; f++)			
									{
										System.out.print("* ");	
									}
										System.out.println();
									}
										System.out.println("4");
									int a, b, bruh=5;
									for(x=0; x<=line; x++)
									{
										for(f=(line-x); f>=0; f--)
									{
									
											System.out.print(" ");
									}
									for (f=0; f<=x; f++)			
									{
										System.out.print("* ");	
									}
										System.out.println();
						}
						
						System.out.println(" ");
						System.out.print("Go back? Y/N: ");
						answer1 =input.next().toUpperCase();
						
						}
						System.out.println(" ");
						System.out.print("Go back? Y/N[6]: ");
						answer1 =input.next().toUpperCase();
						}while (answer1.equals("Y"));}
					
						
					
				
			System.out.println(" ");
			System.out.print("Go back? Y/N ( Y= Main Menu? or N = Quit[7]): ");
			answer1 =input.next().toUpperCase();
			
		
		
		
		}while (answer1.equals("Y"));
		System.out.print("Goodbye "+user);
			}}
		catch(Exception e){
			System.out.print(e);
		}
	}
}}
					
					
					
					
					
					
					
					
					
					
					
			
			
			
			
			
	
					

				
