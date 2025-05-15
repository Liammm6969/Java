import java.util.*;
public class LabExe2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []numbers = new int[20];
		boolean repeat;
		String loop;
		int ctr = 0;
		int idx = -1;
		int []score = new int[9];
		do{
			do{
			repeat = false;
			System.out.println("Enter 20 integers [1-9 only]: ");

			for(int a= 0; a<numbers.length; a++){
				numbers[a] = sc.nextInt();
				if(numbers[a]<1 || numbers[a]>9){
					System.out.println("Invalid input!");
					repeat = true;
					break;
				}

				int key = numbers[a];
				for(ctr=0;ctr<score.length;ctr++){
					if(key == (ctr + 1)){
					idx = ctr;
					break;
					}
				}
				
				if(idx != -1){
					score[idx]++;
				}
			}
		}while(repeat);
		for(int a = 0; a <score.length; a++){
			System.out.println((a + 1) + "-" + score[a]);
		}
		System.out.println("Try Again? Y/N");
		loop = sc.next().toUpperCase();
	}while(loop.equals("Y"));
	}
}


