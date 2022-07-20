package week3.practice;

public class Swap {
	int x = 10;
	int y = 20;

	public void swap() {
		int temp=x;
		x=y;
		y=temp;
	}

	public static void main(String[] args) {
		Swap n = new Swap();
		System.out.println("x = " + n.x);
		System.out.println("y = " + n.y);
		n.swap();
		System.out.println("x = " + n.x);
		System.out.println("y = " + n.y);
	}

}
