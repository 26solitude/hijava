package SecondVacation;

public class Oper {
	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		int result = 0;
		for (int i = 0; i < y; i++) {
			result = add(result, x);
		}

		return result;
	}

	public int div(int x, int y) {
		int result = 0;
		int num = x;
		while (true) {
			num = sub(num, y);
			if (num >= 0)
				result++;
			else
				break;
		}
		return result;
	}
}
