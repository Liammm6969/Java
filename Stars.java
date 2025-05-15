public class Stars {

	public static void main(String[] args) {
		{
			System.out.println("1.");
			for(int x = 0; x<4; x++){
				System.out.println("**********");
			}
			System.out.println("2. ");
			int n, m, row=5;
				for(n=0; n<row; n++)
			{
				for (m=0; m<=n; m++)
			{
				System.out.print("*");
				}
				System.out.println();
				}
			
			System.out.println("3. ");
			int a, b, line=4;
				for (a=0; a<=line; a++)
			{
				for (b=1*(line-a); b>=0; b--)
			{
				System.out.print(" ");
				}
			for (b=0; b<=a; b++)
			{
				System.out.print("*");
				}
				System.out.println();
				}
			
			System.out.println("4. ");
			int c, d, raw = 4;
				for (c=0; c<=raw; c++)
			{
					for (d=raw-c; d>0; d--)
			{
				System.out.print(" ");
				}
				for (d=0; d<=c; d++)
			{
				System.out.print("* ");
			}
				System.out.println();
			}
			}
			}
			
		
	}


