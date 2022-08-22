package hijava.oop;

public class CalculatorImpl implements Calculator{

	public void add(int a, int b) {
		System.out.println(a+b);
	}

	public void sub(int a, int b) {
		System.out.println(a-b);
	}

	public void mul(int a, int b) {
		System.out.println(a*b);
	}

	public void div(int a, int b) {
		if(b==0)
			System.out.println("Cannot divide Zero!!");
		else
		System.out.println(a/b);
	}
}
