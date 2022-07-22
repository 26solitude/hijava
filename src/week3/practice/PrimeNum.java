package week3.practice;

public class PrimeNum {
	public static void main(String[] args) {

		int total = 0;

		for (int i = 2; i < 101; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + "는 소수입니다.");
				total += i;
			}
		}
		System.out.println("total : " + total);
	}
}
