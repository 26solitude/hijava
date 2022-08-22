package hijava.oop;

import week3.practice.Man;

public class american extends Man {
	public american(String name) {
		this.setName(name);
	}

	public void sayHello() {
		System.out.println("Hello");
		System.out.println("My name is " + this.getName() + ".");
	}

	public void eatBread() {
		System.out.println("빵을 먹습니다!");
	}
}
