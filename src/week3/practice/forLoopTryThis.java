package week3.practice;

public class forLoopTryThis {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(' ');
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print('*');
			}
			System.out.println();
		}
//
		int sum = 0;
		boolean P = true;
		for (int i = 2; i < 100; i++) {
			P = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					P = false;
					break;
				}
			}
			if (P == true)
				sum += i;
		}
		System.out.println("1부터 100까지 소수의 합은 " + sum);
	}
}
