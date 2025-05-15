import java.util.Scanner;

public class QuetelexIndex {
	public static void main (String []args){
	Scanner input = new Scanner (System.in);
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
}