package week3.practice;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("result = " + factorial(5));
	}

	private static int factorial(int num) {
		System.out.println("factorial(" + num + ") : ");

		if (num <= 1) return 1;
		
		return num * factorial(num - 1);
	}
	
	// 재귀함수는 스택구조와 같다.
}
