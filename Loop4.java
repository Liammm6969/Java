import java.util.*;
public class Loop4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String loop;
		int number, i;  
		
		do{
		System.out.print("Enter a number: ");  
		number = input.nextInt();    
		i=1;   
		
		while(i<=number) 
		{  
			System.out.println(i +" ");   
			i=i+2;  
		}
		System.out.println("Try again Y/N?");
		loop = input.next().toUpperCase();
	}while(loop.equals("Y"));
	}
}

