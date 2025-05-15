import java.util.*;
public class CarRentall {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int typeOfCar;
		int numberOfDays;
		int milesTravelled;
		int insuranceType;
		double totalDailyCharge=0;
		double totalMileageCharge=0;
		double totalInsuranceCost=0;
		double totalCost=0;
	
		
		System.out.println("Enter Type of Car: ");
		typeOfCar = input.nextInt();
		System.out.println("Enter Number of Days: ");
		numberOfDays = input.nextInt();
		System.out.println("Enter Miles Travelled: ");
		milesTravelled = input.nextInt();
		System.out.println("Insurance Type: ");
		insuranceType = input.nextInt();
		
		
		switch (typeOfCar){
		case 1:
		if(typeOfCar == 1 ){
			totalDailyCharge = numberOfDays * 8;
			totalMileageCharge = milesTravelled * 0.06;
		}
			break;
		case 2:
		 if(typeOfCar == 2){
			totalDailyCharge = numberOfDays * 10;
			totalMileageCharge = milesTravelled * 0.08;
		}
		 	break;
		case 3:
		 if(typeOfCar == 3){
			totalDailyCharge = numberOfDays * 15;
			totalMileageCharge = milesTravelled * 0.12;
		}
		 	break;
		default:
			System.out.println("Car type not Available. ");
			break;
		}
		
		
		switch(insuranceType){
		case 1:
		if (insuranceType == 1){
			totalInsuranceCost = (totalDailyCharge + totalMileageCharge)*.20;
		}
		break;
		case 2:
		if(insuranceType == 2){
			totalInsuranceCost = numberOfDays * 4;
		}
		break;
		
		default:
			System.out.println("Insurance not available: ");
		
		break;
		}
		totalCost = totalDailyCharge + totalMileageCharge + totalInsuranceCost;
		System.out.println("The total cost is: " +totalCost);
	}
}
