package week3.practice;

public class Fibonacci {

	public static void main(String[] args) {
		fibo(10);
	}

	private static void fibo(int num) {
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0; i<num-1; i++)
		{
			int temp=a;
			a=b;
			b+=temp;
			System.out.print(b+" ");
		}
	}

}
