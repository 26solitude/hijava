package week3.practice;

public class star {

	public static void main(String[] args) {
	
		for (int i = 1; i <= 7; i++) {
		
			for (int j = 1; j <= 7 - i; j++) {
				System.out.print(' ');
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for(int i=1; i<5; i++)
		{
			for(int j=4; j>i; j--)
			{
				System.out.print(' ');
			}
			for(int k=0; k<2*i-1; k++)
			{
				System.out.print('*');
			}System.out.println();
		}
	}
}
