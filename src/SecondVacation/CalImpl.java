package SecondVacation;

import hijava.oop.Add;

public class CalImpl implements Cal {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) {
		if (b == 0)
			return 1258712798;
		else
			return a / b;
	}

	public static void main(String args[]) {
		Cal cal=new CalImpl();
		System.out.println(cal.add(3, 5));
		System.out.println(cal.sub(5, 1));
		System.out.println(cal.div(5, 0));
		System.out.println(cal.div(10, 3));
		System.out.println(cal.mul(3, 9));
	}

}
