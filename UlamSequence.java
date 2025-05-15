import java.util.*;
public class UlamSequence {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String loop = "Y";
		int i;
		
		do {
			System.out.println("Enter a positive integer: ");
			i = input.nextInt();
			while (i!=1){
				if(i%2==0){
					i = (i/2);
					System.out.print(i + " ");
				}
				
			else if (i%2!=0){
				i = (3*i+1);
				System.out.print(i + " ");
			}
			}
			System.out.print("\nTry again Y/N?");
			loop = input.next().toUpperCase();
		}while(loop.equals("Y"));
		
	}

}
