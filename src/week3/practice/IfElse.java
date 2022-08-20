package week3.practice;

public class IfElse {
	public static void main(String[] args) {
		long ctm = System.currentTimeMillis()%10;
		System.out.println("ctm = " + ctm);

		long sct = ctm % 3;

		if (sct == 1) {
			System.out.println("one");
		} else if (sct == 2) {
			System.out.println("two");
		} else {
			System.out.println("zero");
		}
		
	}
}