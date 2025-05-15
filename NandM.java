import java.util.*;
public class NandM {

	public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			String loop;

			
			do{
			System.out.println("Enter start number ");
			int num;
			int i = input.nextInt();
			
			System.out.println("Enter end number ");
			System.out.print("");
			num = input.nextInt();
			
			if(i>num)
			{
			for(i=i;i>=num;i--)
			{
				System.out.print(i + " ");
			}
			}
		else if (i<num)
		{
			for(i=i;i<=num;i++)
			{
				System.out.print(i + " ");	
			}
		}	
		System.out.print(" ");
		System.out.print("\nTry again Y/N?");
		loop = input.next().toUpperCase();
	}
	while(loop.equals("Y"));
	
	}
}

