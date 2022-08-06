package hijava.oop;

import java.util.ArrayList;

import week3.practice.Man;

public class Main {

	public static void main(String[] args) {
//		al();
		MonAndSon();

//		KoreanAndAmerican();
	}

	private static void KoreanAndAmerican() {
		Man kor = new korean("홍길동");
		Man amr = new american("alexander");

		sayHi(kor);
		sayHi(amr);
	}

	private static void sayHi(Man man) {
		man.sayHello();
	}

	private static void MonAndSon() {
		Mom mom = new Mom();
		Son son = new Son();

//		mom.eat();
//		son.eat();

//		mom.say(); 
//		son.say();

		eatTest();

//		eat(mom);
//		eat(son);
	}

	private static void eatTest() {
		Man korean = new korean("홍길동");
		american american = new american("alexander");

		eat(korean);
		eat(american);
	}

	private static void eat(Man m) {

		if (m instanceof korean) {
			((korean) m).eatRice();
		} else if (m instanceof american) {
			((american) m).eatBread();
		} else {
			System.out.println("해당 인스턴스가 없습니다!!");
		}
	}

	private static void eat(Mom m) {
		if (m instanceof Son)
			m = (Son) m;

		if (m instanceof Son) {
			System.out.println("먹어");
		} else if (m instanceof Mom) {
			System.out.println("드세요");
		} else {
			System.out.println("먹지마");
		}
	}

	private static void al() {
		ArrayList<Man> people = new ArrayList<>(9);

		for (int i = 0; i < 9; i++) {
			Man m = new Man("김" + (i + 1) + "수");
			m.buyCoffee(1);

			people.add(m);
		}

		int size = people.size();

		for (int i = 0; i < size; i++) {
			System.out.println(people.get(i));
		}
	}
}