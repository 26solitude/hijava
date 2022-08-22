package week3.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrimeNum {
	public static void main(String[] args) {
		ArrayList<Integer> primeNum = new ArrayList<>();

		boolean isPrime = true;
		for (int i = 2; i < 1001; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true)
				primeNum.add(i);
		}

		Scanner s = new Scanner(System.in);

		while (true) {

			System.out.println("소수판별을 위한 숫자를 입력하세요. 종료를 원하면 0을 입력하세요.");
			int num = s.nextInt();

			if (num == 0) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}

			int size = 0;
			for (int i = 0; i < num; i++) {
				if (primeNum.get(i) > num) {
					size = i - 1;
					break;
				}
			}

			for (int i = 0; i < size; i++) {
				isPrime = true;
				if (num % primeNum.get(i) == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == true || num==2)
				System.out.println(num + "은 소수입니다.");
			else
				System.out.println(num + "은 소수가 아닙니다.");
		}

		s.close();
	}
}
