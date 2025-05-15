import java.util.Scanner;
public class Slumbook2 {
	public static void main(String []args){
	
	Scanner input = new Scanner(System.in);
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
}
