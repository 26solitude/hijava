package hijava.oop;

public class DogAbs extends AnimalAbs{

	public void bark() {
		System.out.println("멍멍입니다~");
	}
	
	public static void eat(String food)
	{
		System.out.println("Dog eat "+food);
	}
}
