package pascals_trianglr;

public class main_class {

	public static void main(String[] args) {
		
//		int n=5;
		
		for(int i=0;i<5;i++)
		{
			// spaces 
			
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			
			// numbers
			
			int numbers = 1;
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(numbers+" ");
				numbers = numbers * (i-k)/(k+1);
			}
			System.out.println("");
		}
	}
}
