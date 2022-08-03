package week3.practice;

public class ForLoop2 {
	public static void main(String[] args) {
		// 루프를 이용한 구구단 표현
		for(int i=2; i<10; i++)
		{
			System.out.println(i+"단");
			for(int j=1; j<10; j++)
			{
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}//
}
