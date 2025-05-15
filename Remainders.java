import java.util.*;
public class Remainders {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String loop = "Y";
		
		do {
			int n;
			int x = 1;
			System.out.println("Enter a positive integer: ");
			n = input.nextInt();
		while(x<n) {
			x++;
			if (x%3==1 && x%4==2 && x%5==3 && x%6==4)
				System.out.print(" " + x);
			
		}System.out.print("\nTry again Y/N?");
		loop = input.next().toUpperCase();
		
		}while(loop.equals("Y"));
	}

}
