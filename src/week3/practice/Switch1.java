package week3.practice;

public class Switch1 {
	public static void main(String[] args) {
		long ctm = System.currentTimeMillis() % 10;
		System.out.println("ctm = " + ctm);

		switch ((int) ctm) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("zero");
			break;
		}
	}
}
