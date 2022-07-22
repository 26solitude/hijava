package week3.practice;

public class onetohunnit {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;
		}
		
		System.out.println("sum : " + sum);

		sumByFor();
	}

	private static void sumByFor() {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
