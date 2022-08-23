package hijava.oop;

public class Oper {

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public void mul(int x, int y) {
		int sum = 0;
		for (int i = 0; i < y; i++) {
			sum = add(sum, x);
		}
		System.out.println(sum);
	}

	public void div(int x, int y) {
		int result = 0;
		while (x > 0) {
			result++;
			x = sub(x, y);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int x = 10, y = 5;

		Oper op = new Oper();
		int a = op.add(x, y);
		int s = op.sub(x, y);
		System.out.println(a + ", " + s);
		op.mul(x, y);
		op.div(x, y);
	}

}
