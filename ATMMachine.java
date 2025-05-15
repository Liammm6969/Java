import java.util.Scanner;

public class ATMMachine {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
	
		int amountOfWithdrawal = 0;
		int currentBalance = 0;
		
		System.out.println("Enter Current Balance ");
		currentBalance = input.nextInt();
		System.out.println("Amount of Withdrawal ");
		amountOfWithdrawal = input.nextInt();
		
		//if the new balance is less than 150 "Balance below 150"
		
		
		int newBalance = currentBalance - amountOfWithdrawal;
		
		if (currentBalance < amountOfWithdrawal){
			System.out.println("Withdrawal denied");
		}
		else if (currentBalance >= amountOfWithdrawal){
			System.out.println("New Balance " +newBalance);
		}
		
		
		
		 if (newBalance <150 && newBalance >=0){
			System.out.println("Remarks Balance below 150" );
		}
		
	}	
}
