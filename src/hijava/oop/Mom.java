package hijava.oop;

public class Mom {
	private String name;

	public Mom(String name) {
		this.name = name;
	}

	public Mom() {
		this("엄마");
	}

	public String getName() {
		return this.name;
	}

	public void eat() {
		System.out.println("먹는다");
	}

	public void say() {
		System.out.println("엄마");
	}
}
