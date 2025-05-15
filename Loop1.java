import java.util.*;
public class Loop1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String loop;
		int i;
		do
		{
		i=1;
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		
		}

		System.out.println("Try again Y/N?");
		loop = input.next().toUpperCase();
	}while(loop.equals("Y"));
		
	}
}
