
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
public class FinalProjectGalano {
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("HELLO");
		 frame.setSize(400, 200);
		JLabel label = new JLabel("WELCOME TO MY FINAL PROJECT!!", SwingConstants.CENTER);
		frame.add(label);
       frame.setVisible(true);
		try{
		Scanner input = new Scanner(System.in);{
			String name1;
			String ans1;
			System.out.print("Enter Name : " );	
			name1 = input.next();
			do{
				int num;
				System.out.println("Welcome! " +name1 );	
				System.out.println("Please select number");
				System.out.println("[1] Printing");
				System.out.println("[2] Data Types, Variable and Operators");
				System.out.println("[3] Getting Data From Keyboard");
				System.out.println("[4] Control Structure");
				System.out.println("[5] Control Strucuture (Switch)");
				System.out.println("[6] Repetition Control Structure");
				System.out.print("Enter selected number: ");
				num = input.nextInt();
				
					
				
					if(num==1){
						do{
							String letterABCD;
						
							System.out.println("[A] Slumbook.java: " );
							System.out.println("[B] FaceTime.java " );
							System.out.println("[C] DreamHouse.java " );
							System.out.println("[1] PRINTING(Choose one of the following): " );	
							letterABCD = input.next().toUpperCase();
							if(letterABCD.equals("A")){
								
								System.out.println("ABOUT ME");	
								System.out.println("First Name: Arnoell Kelhzcy");
								System.out.println("Last Name: Galano");	
								System.out.println("Middle Name: Afan");
								System.out.println("Age: 17");
								System.out.println("Birthday: 12/23/04");
								System.out.println("Address: P7,Poblacion,Diadi,Nueva Vizcaya");
								System.out.println("Contact Number: 09094811849");
								System.out.println("Motto: Time is gold");
								System.out.println("Faviorates");
								System.out.println("Food: Adobo");
								System.out.println("Color: Black,Violet");
								System.out.println("Song: Seek & Destroy Metallica");
								System.out.println("Movie: 47Ronin");
								System.out.println("Describe yourself: Kind,Loud,Talkative,I like dark Humour,Friendly");
							}
							else if(letterABCD.equals("B")){

								System.out.println("         0000000000000000");
								System.out.println("      0000000000000000000000");
								System.out.println("    00000000000000000000000000");
								System.out.println("  000000000000000000000000000000");
								System.out.println("00000    00000000000    0000000000");
								System.out.println("0000 #### 000000000 #### 000000000");
								System.out.println("0000 #### 000000000 #### 000000000");
								System.out.println("00000    00000000000    0000000000");
								System.out.println("00000000000 ##### 0000000000000000");
								System.out.println(" 000000000 ####### 000000000      ");
								System.out.println(" 000000000 ##000## 000000000      ");
								System.out.println("       0000000000000000            ");
								System.out.println("       00# 00#00#00 #00            ");
								System.out.println("       00# 00#00#00 #00            ");
								System.out.println("       00# 00#00#00 #00            ");
								System.out.println("       00# 00#00#00 #00            ");
								System.out.println("       0000000000000000            ");
								System.out.println("        00000000000000            ");	
								System.out.println("         000000000000            ");
							}			
							else if(letterABCD.equals("C")){
								System.out.println("   			====");
								System.out.println(" 			!!!!");
								System.out.println("      ==========================");
								System.out.println("    %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
								System.out.println("  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
								System.out.println("  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
								System.out.println("  ||      _____          _____    ||");
								System.out.println("  ||      | | |          | | |    ||");
								System.out.println("  ||      |-|-|          |-|-|    ||");
								System.out.println("  ||      #####          #####    ||");
								System.out.println("  ||                              ||");
								System.out.println("  ||      _____   ____   _____    ||");
								System.out.println("  ||      | | |   @@@@   | | |    ||");
								System.out.println("  ||      |-|-|   @@@@   |-|-|    ||");
								System.out.println("  ||      #####   @@*@   #####    ||");
								System.out.println("  ||              @@@@            ||");
								System.out.println(" ******************____****************");
								System.out.println(" **************************************");
								System.out.println("");
								System.out.println("");
							}
							
							System.out.println(" ");
							System.out.print("Go back? Y/N(1 Printing): ");
							ans1 =input.next().toUpperCase();
							}
						while (ans1.equals("Y")); }
						else if(num==2){
							do{
						
								String ansabcd;
							
								System.out.println("[A] AreaOfATriangle.java: " );
								System.out.println("[B] CelsiusToFahrenheit.java " );
								System.out.println("[C] GradeAverage.java " );
								System.out.println("[D] MultiplyFifteen.java " );
								System.out.println("[2] DATA TYPES, VARIABLES AND OPERATORS(Choose one of the following): " );	
							ansabcd = input.next().toUpperCase();
							
							if(ansabcd.equals("A")){
								
							
								double a = 33.6;
								double b = 15.7;
								double c = 2;

								double product = b * a ;//527.52
								double quotient = product / c;
								System.out.print("The Area of the Triangle is:"   +quotient);

							}
							else if(ansabcd.equals("B")){
								double a = 58.3;
								double b = a * 9 ;
								double c = b / 5 ;
								double d = c + 32;
								System.out.println("the fahrenheit of 58.3 celcius is "     +d);
								
							}
							else if(ansabcd.equals("C")){
								 double a = 87.5;
								 double b = 76.3;
								 double c = 82.7;
								 double d = 88.43;
								 double e = 94.77;
								 double k = a + b + c + d + e;
								 double g = k / 5 ;
								 System.out.println("The average is: "        +g);
							}
							else if(ansabcd.equals("D")){
								int number;
								System.out.print(" Enter a Number: ");
								number = input.nextInt();
						
								int p = 15;
								
								
								int product = p * 1;
								int producta = p * 2;
								int productb = p * 3;
								int productc = p * 4;
								int productd = p * 5;
								int producte = p * 6;
								int productf = p * 7;
								int productg = p * 8;
								int producth = p * 9;
								int producti = p * 10;
								System.out.println("1 Times 15 = "+product);
								System.out.println("1 Times 15 = "+producta);
								System.out.println("1 Times 15 = "+productb);		
								System.out.println("1 Times 15 = "+productc);	
								System.out.println("1 Times 15 = "+productd);	
								System.out.println("1 Times 15 = "+producte);	
								System.out.println("1 Times 15 = "+productf);	
								System.out.println("1 Times 15 = "+productg);	
								System.out.println("1 Times 15 = "+producth);	
								System.out.println("1 Times 15 = "+producti);	
									
							}
							
							System.out.println(" ");
							System.out.print("Go back? Y/N[2]: ");
							ans1 =input.next().toUpperCase();
							}
						while (ans1.equals("Y")); }
				else if(num==3){
					do{
				
						String abcdlttrs;
						
						System.out.println("[A] Slumbook2.java " );
						System.out.println("[B] Arithmetic.java " );
						System.out.println("[3] GETTING DATA FROM KEYBOARD(Choose one of the following): " );	
					abcdlttrs = input.next().toUpperCase() ;
					if(abcdlttrs.equals("A")){
						
					
						System.out.println("ABOUT ME");
						
						String FirstName;
						System.out.print("First Name: ");
						FirstName = input.next();
						
						String LastName;
						System.out.print("Last Name: ");
						LastName = input.next();
						
						String MiddleName;
						System.out.print("Middle Name: ");
						MiddleName = input.next();
						
						int Age;
						System.out.print("Age: ");
						Age = input.nextInt();
						
						String Birthday;
						System.out.print("Birthday: ");
						Birthday= input.next();
						
						String Address;
						System.out.print("Address: ");
						Address = input.next();
								
						int ContactNum;
						System.out.print("Contact Number: ");
						ContactNum = input.nextInt();
						
						String Motto;
						System.out.print("Motto: ");
						Motto = input.next();
						
						System.out.println("------------");
						System.out.println(" FAVORITES");
						System.out.println("-----------");
						
						String Food;
						System.out.print("Food: ");
						Food = input.next();
						
						String Color;
						System.out.print("Color: ");
						Color = input.next();
						
						String Song;
						System.out.print("Song: ");
						Song = input.next();
						
						String Movie;
						System.out.print("Movie: ");
						Movie = input.next();
						
						String Describe;
						System.out.print("Describe yourself: ");
						Describe = input.next();
						
								
					

					}
					else if(abcdlttrs.equals("B")){
						double number;
						System.out.print(" Enter 1st number: ");
						number = input.nextDouble();
						double n;
						System.out.print(" Enter 2nd number: ");
						n = input.nextDouble();
				
					double sum =  number + n;
					double difference =  number - n;
					double product =  number * n;
					double quotient =  number / n;
					double modulo = number % n;
					System.out.println("Sum = "+sum);
					System.out.println("Difference = "+difference);
					System.out.println("Product = "+product);
					System.out.println("Quotient = "+quotient);
					System.out.println("Modulo = "+modulo);
					}
					
					
					System.out.println(" ");
					System.out.print("Go back? Y/N[3]: ");
					ans1 =input.next().toUpperCase();
					}while (ans1.equals("Y"));
				}
					if(num==4){
						do{
							String ans444;
					
							System.out.println("[A] QuetelexIndex	.java: " );
							System.out.println("[B] HuttValleyEnergy.java " );
							System.out.println("[C] FuelPrice.java " );
							System.out.println("[4] CONTROLLED STRUCTURES(Choose one of the following): " );	
							ans444 = input.next().toUpperCase();
							if(ans444.equals("A")){
								double Height;
								System.out.print("enter height(m):");
								Height = input.nextDouble();
								double a;
								System.out.print("enter weight (kg):");
								a = input.nextDouble();
								
								
								double index = a / (Height*Height);
								boolean tempt = (index < 20);
								if ( tempt ){
									System.out.println("Quetet index: "      +index);
								}
								if ( tempt){
									
									System.out.print("under weight");
								}
								else if (( index <= 25)&& (index >=20)){
								
									System.out.print("healthy weight");
								}
								else if (( index <= 30)&& (index >=25)){
									
									System.out.print("mildly overweight");
								}
								else if (( index <= 40)&& (index >=30)){
								
									System.out.print("very overweight");
								}
								else if  (index > 40) {
									
									System.out.print("extremely overweight");
								}
							}
							else if(ans444.equals("B")){
								double kh = 0;
								double cost = 10;
								double totalcost;
								double modulo;
								double moduloSolve;
								
								
								System.out.print("enter meter reading: ");
								kh = input.nextDouble();
								if (kh <500){
									System.out.print("Total charge/cost is  " +cost );
								}
								else if ((kh >=501)&&(kh <=1000)){
									modulo = kh % 500;
								moduloSolve=cost+(modulo *0.05);
								System.out.print("Total charge/cost is  " +moduloSolve);
								}
								
								
								
								else if (kh >=1000){
									modulo = kh % 1000;
								moduloSolve=cost+(modulo *0.03);
								System.out.print("Total charge/cost is   " +moduloSolve);
								}
							}
							else if(ans444.equals("C")){
								double oil;
								double liters;
								double cost;
								
								
								System.out.println(" [1] Super XCS ");
								System.out.println(" [2] Diesoline");
								System.out.println(" [3] Diesel ");
								System.out.println(" [4] Regular ");
								System.out.println(" [5] Gas ");
								
								System.out.print(" Enter your selection: ");
								oil = input.nextDouble();
								System.out.print(" Enter number of liter/s: ");
								liters = input.nextDouble();
								
								if (oil == 1){
									cost =   68.75 * liters;
									System.out.print(" Total charge/cost is " +cost);
								}
								else if(oil == 2){
									cost = liters * 87.25;
									System.out.print(" Total charge/cost is " +cost);
								
						}
								else if(oil == 3){
									cost = liters * 86.50;
									System.out.print(" Total charge/cost is " +cost);
								
						}
								else if(oil == 4){
									cost = liters * 65.50;
									System.out.print(" Total charge/cost is " +cost);
								
						}
								else if(oil == 5){
									cost = liters * 64.75;
									System.out.print(" Total charge/cost is " +cost);
								
						}
							}
							
							System.out.println(" ");
							System.out.print("Go back? Y/N[4]: ");
							ans1 =input.next().toUpperCase();
							}
						while (ans1.equals("Y")); }
					
					if(num==5){
						do{
							String lttrs1234;
							
							System.out.println("[A] ElectricBill.java: " );
							System.out.println("[B] DressCode.java " );
							System.out.println("[C] CarRental.java" );
							System.out.println("[D] Rock.java " );
							System.out.println("[5] CONTROLLED STRUCTURES SWITCH(Choose one of the following): " );	
							lttrs1234 = input.next().toUpperCase();
							if(lttrs1234.equals("A")){
								
							
								double presentReading;
								double previousReading;
								double due;
								double khdue;
								int build;
								double modulo;
								
								System.out.print("*building code*");
								System.out.print("<1> - residential <2> - commercial <3> - industrial: " );
								build = input.nextInt();
								
								System.out.print("enter Present Reading: ");
								presentReading = input.nextDouble();
								System.out.print("enter Previous Reading: ");
								previousReading = input.nextDouble();
								khdue = presentReading-previousReading;
							
							switch (build){
							case 1:
								if (khdue <50){
									System.out.print("Amount due: 27");}
								else if (khdue >50 && khdue<100){
									modulo = khdue % 50;
							due= 27 +(modulo*0.75); 
							System.out.print("Amount due: "+due);}
								else if (khdue >100 && khdue<150){
									modulo = khdue % 100;
							due= 27 +(modulo*3.50); 
							System.out.print("Amount due: "+due);}
								else if (khdue >150){
									modulo = khdue % 150;
							due= 27 +(modulo*5.50); 
							System.out.print("Amount due: "+due);}
								break;
							case 2:
								if (khdue <50){
									System.out.print("Amount due: 35");}
								else if (khdue >50 && khdue<100){
									modulo = khdue % 50;
							due= 35 +(modulo*0.75); 
							System.out.print("Amount due: "+due);}
								else if (khdue >100 && khdue<150){
									modulo = khdue % 100;
							due= 35 +(modulo*3.50); 
							System.out.print("Amount due: "+due);}
								else if (khdue >150){
									modulo = khdue % 150;
							due= 35 +(modulo*5.50); 
							System.out.print("Amount due: "+due);}
								break;
							case 3:
								if (khdue <50){
									System.out.print("Amount due: 52");}
								else if (khdue >50 && khdue<100){
									modulo = khdue % 50;
							due= 52 +(modulo*0.75); 
							System.out.print("Amount due: "+due);}
								else if (khdue >100 && khdue<150){
									modulo = khdue % 100;
							due= 52 +(modulo*3.50); 
							System.out.print("Amount due: "+due);}
								else if (khdue >150){
									modulo = khdue % 150;
							due= 52 +(modulo*5.50); 
							System.out.print("Amount due: "+due);}
								break;
							
							}
							}
							else if(lttrs1234.equals("B")){
								String day;
								System.out.print(" Enter day of the week:  ");
								day =  input.next();
								switch(day.toLowerCase()){
								case "monday":
									System.out.print("Uniform / PE Uniform");
									break;
									case "tuesday":
									System.out.print("Uniform / PE Uniform");					
									break;
									case "wednesday":
									System.out.print("Dress down");
									break;
								
									case "thursday":
										System.out.print("Uniform / PE Uniform");
										break;
									case "friday":
										System.out.print("Recognizable School shirts");
										break;
									case "saturday":
										System.out.print("Dress down");
										break;
									case "sunday":
										System.out.print("NO CLASS TODAY,You are not allowed in the campus.");
										break;
									default:
										System.out.print("Uniform");
									break;
							}
							}
							
							else if(lttrs1234.equals("C")){
								int CarType;
								 double NumOfDays;
								 double AnumOfdays;
								 double milesTraveled;
								 int insuranceType;
								 double tmilesTraveled;
								 double insuranceValue;
								 double Total;
								 
								 System.out.print("enter Type of car: ");
								 CarType = input.nextInt();
								 System.out.print("enter Number of Days: ");
								 NumOfDays = input.nextDouble();
								 System.out.print("enter Miles Traveled: ");
								 milesTraveled = input.nextDouble();
								 System.out.print("enter Insurance Type: ");
								 insuranceType = input.nextInt();
								
								
								 
								 switch (CarType){
								 case 1:
									 AnumOfdays= NumOfDays *8;
									 tmilesTraveled = milesTraveled *0.06;
									 if (insuranceType==1){
										 insuranceValue = (AnumOfdays+tmilesTraveled)*.20;
										 Total =AnumOfdays+tmilesTraveled+insuranceValue;
										 System.out.print("Total Bill: "+Total);
										 
									 }
									 else if (insuranceType==2){
										 insuranceValue = NumOfDays * 4;
										 Total =AnumOfdays+tmilesTraveled+insuranceValue;
										 System.out.print("Total Bill: "+Total);
										 
									 }
									 break;
								 case 2:
									 AnumOfdays= NumOfDays *10;
									 tmilesTraveled = milesTraveled *0.08;
									 if (insuranceType==1){
										 insuranceValue = (AnumOfdays+tmilesTraveled)*.20;
										 Total =AnumOfdays+tmilesTraveled+insuranceValue;
										 System.out.print("Total Bill: "+Total);
										 
									 }
									 else if (insuranceType==2){
										 insuranceValue = NumOfDays * 4;
										 Total =AnumOfdays+tmilesTraveled+insuranceValue;
										 System.out.print("Total Bill: "+Total);
										 
									 }
								 break;
								 case 3:
									 AnumOfdays= NumOfDays *15;
									 tmilesTraveled = milesTraveled *0.12;
									 if (insuranceType==1){
										 insuranceValue = (AnumOfdays+tmilesTraveled)*.20;
										 Total =AnumOfdays+tmilesTraveled+insuranceValue;
										 System.out.print("Total Bill: "+Total);
										 
									 }
									 else if (insuranceType==2){
										 insuranceValue = NumOfDays * 4;
										 Total =AnumOfdays+tmilesTraveled+insuranceValue;
										 System.out.print("Total Bill: "+Total);
										 
									 }
								 
								 break;
							}
							}
							
							else if(lttrs1234.equals("D")){
								String play;
								System.out.println("Enter your play: R, P, or S");
								play = input.next();
							
								Random rndm = new Random();
								int max =  3;
								int value = rndm.nextInt(max);
							
								
								switch(play.toLowerCase()){
								case "r":
									if (value==1){
										System.out.println("Computer play is R");	
										System.out.println("its a tie");	
										
									}
									else if (value==2){
										System.out.println("Computer play is P");	
										System.out.println("you lost :(");	
										
									}
									else if (value==3){
										System.out.println("Computer play is S");	
										System.out.println("YOU WON!!!:)");	
										
									}
									break;
								case "p":
									if (value==1){
										System.out.println("Computer play is R");	
										System.out.println("YOU WON!!!:)");	
										
									}
									else if (value==2){
										System.out.println("Computer play is P");	
										System.out.println("its a tie");	
										
									}
									else if (value==3){
										System.out.println("Computer play is S");	
										System.out.println("you lost :(");	
										
									}
									break;
								case "s":
									if (value==1){
										System.out.println("Computer play is R");	
										System.out.println("you lost :(");
										
									}
									else if (value==2){
										System.out.println("Computer play is P");	
										System.out.println("YOU WON!!!:)");	
										
									}
									else if (value==3){
										System.out.println("Computer play is S");	
										System.out.println("its a tie");		
										
									}
									break;
							}
							}
							
							System.out.println(" ");
							System.out.print("Go back? Y/N[5]: ");
							ans1 =input.next().toUpperCase();
							}
						while (ans1.equals("Y")); }
					else if(num==6){
						do{
					
							String lastmenuabcd;
							
							System.out.println("[A] Loop1.java: " );
							System.out.println("[B] Loop2.java " );
							System.out.println("[C] Loop3.java " );
							System.out.println("[D] Loop4.java " );
							System.out.println("[E] UlamSequence.java " );
							System.out.println("[F] NandM.java " );
							System.out.println("[G] Remainders.java " );
							System.out.println("[H] Stars.java " );
							System.out.println("[6] REPETITION CONTROL STRUCTURE(Choose one of the following): " );
						lastmenuabcd = input.next().toUpperCase();
						if(lastmenuabcd.equals("A")){
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
						else if(lastmenuabcd.equals("B")){
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
						else if(lastmenuabcd.equals("C")){
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
						else if(lastmenuabcd.equals("D")){
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
						else if(lastmenuabcd.equals("E")){
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
						
						else if(lastmenuabcd.equals("F")){
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
						else if(lastmenuabcd.equals("G")){
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
						
						else if(lastmenuabcd.equals("H")){
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
								int x, f1, line=5;
										for(x=0; x<=line; x++)
									{
										for(f1=2*(line-x); f1>=0; f1--)
									{
									
											System.out.print(" ");
									}
									for (f1=0; f1<=x; f1++)			
									{
										System.out.print("* ");	
									}
										System.out.println();
									}
										System.out.println("4");
									int a, b, bruh=5;
									for(x=0; x<=line; x++)
									{
										for(f1=(line-x); f1>=0; f1--)
									{
									
											System.out.print(" ");
									}
									for (f1=0; f1<=x; f1++)			
									{
										System.out.print("* ");	
									}
										System.out.println();
						}
						System.out.println(" ");
						System.out.print("Go back? Y/N: ");
						ans1 =input.next().toUpperCase();
						
						}
						System.out.println(" ");
						System.out.print("Go back? Y/N[6]: ");
						ans1 =input.next().toUpperCase();
						}while (ans1.equals("Y"));}
					
						
					
				
			System.out.println(" ");
			System.out.print("Go back? Y/N (To The Menu?): ");
			ans1 =input.next().toUpperCase();
			
		
		
		
		}while (ans1.equals("Y"));
			}}
		catch(Exception e){
			System.out.print(e);
		}
	}
	}
					
					
					
					
					
					
			
			
			
			
			

					

				

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

