package week3.practice;

import java.util.Iterator;

public class PrimeNum {
	public static void main(String[] args) {

		if(args.length>0)
		{
			for(int i=0; i<args.length; i++)
			{
				System.out.println("args["+i+"] = "+args[i]);
			}
		}
		
		int total = 0;

		for (int i = 2; i < 101; i++) {
			
			if (isPrime(i)) {
				total += i;
			}
		}
		System.out.println("total : " + total);
	}

	// 소수를 판별하라 !!
	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}  
		}
		return true;
	}
}
