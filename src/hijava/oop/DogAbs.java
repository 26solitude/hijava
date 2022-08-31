package hijava.oop;

public class DogAbs extends AnimalAbs {

	public void bark() {
		System.out.println("멍멍입니다~");
	}

	public static void eat(String food) {
		System.out.println("Dog eat " + food);
	}

	@Override
	public String toString() {
		return "This is Dog";
	}

	public static void main(String[] args) {
		DogAbs d = new DogAbs();
		System.out.println(d);

		String s = "Test : " + d;
		System.out.println(s);
	}
}
