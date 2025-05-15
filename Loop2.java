import java.util.*;
public class Loop2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		String loop;
		int i;
		do{
		System.out.print("Enter a number: ");
		i = input.nextInt();
		while(i!=0)
		{
			System.out.println(i);
			i--;

		}

		System.out.println("Try again Y/N?");
		loop = input.next().toUpperCase();
	}while(loop.equals("Y"));
	
}
}
