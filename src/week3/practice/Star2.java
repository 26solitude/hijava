package week3.practice;

public class Star2 {

	public static void main(String[] args)
	{
		for(int i=1; i<8; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print('*');
			}System.out.println();
		}
		
		for(int k=1;k<8; k++)
		{
			for(int l=1; l<k; l++)
			{
				System.out.print(' ');
			}
			for(int m=8; m>k; m--)
			{
				System.out.print('*');
			}System.out.println();
			
		}
		
		for(int n=1; n<8; n++)
		{
			for(int o=7; o>n; o--)
			{
				System.out.print(' ');
			}
			for(int p=0; p<n; p++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
