package week3.practice;

public class Three {
	public static void main(String[] args) {
		int a = 3;

		String s = (a > 0) ? "양수" : "음수";
		System.out.println("s = " + s);

		int k = !!(a > 0) ? 100 : 1000;
		System.out.println("k = " + k);
	}
}
