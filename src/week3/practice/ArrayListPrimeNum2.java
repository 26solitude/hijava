package week3.practice;

import java.util.ArrayList;

public class ArrayListPrimeNum2 {
	public static void main(String[] args) {

		int total = 0;

		for (int num = 2; num < 101; num++) {
			if (isPrime(num)) {
				total += num;
			}
		}
		System.out.println("Total is " + total);
	}

	private static ArrayList<Integer> primeList = new ArrayList<>();

	private static boolean isPrime(int num) {

		for (Integer i : primeList) {
			if (num % i == 0)
				return false;
		}
		primeList.add(num);
		return true;
	}
}