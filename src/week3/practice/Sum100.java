package week3.practice;

public class Sum100 {
	public static void main(String[] args) {

		sumByFor();
		sumByWhile();

	}

	private static void sumByFor() {
		int i = 0;
		int sum = 0;

		while (++i <= 100) {
//			if (i % 2 == 0)
//				continue;

			sum += i;
		}

		System.out.println("Result is = " + sum);
	}

	private static void sumByWhile() {
		int sum2 = 0;

		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0)
				continue;

			sum2 += j;
		}

		System.out.println("Result2 is = " + sum2);
	}
}