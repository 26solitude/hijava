package hijava.oop;

import java.util.ArrayList;

import week3.practice.Man;

public class Main {

	public static void main(String[] args) {

		Calculator();

//		SoftWare();

//		netsports();

//		weight();

//		animal();

//		AbstSuper sp=new AbstChild();
//		int i=5;
//		int j=10;
//		System.out.println("min = "+sp.min(i, j)+" max = "+sp.max(i, j));

//		al();
//		MonAndSon();

//		KoreanAndAmerican();
	}

	private static void Calculator() {
		Calculator calc=new CalculatorImpl();
		int x=10, y=5;
		calc.add(x, y);
		calc.div(x, y);
		calc.div(x, 0);

	}

	private static void SoftWare() {
		SoftWare web = new WebSite();
		SoftWare mob = new MobileApp();

		web.process();
		System.out.println("---------------");
		mob.process();
	}

	private static void netsports() {
		NetSports pp = new PingPong();
		NetSports te = new Tennis();

		pp.play();
		System.out.println("---------------");
		te.play();
	}

	private static void animal() {
		AnimalAbs dog = new DogAbs();
		AnimalAbs cat = new CatAbs();
		barkAnimal(dog);
		barkAnimal(cat);
	}

	private static void barkAnimal(AnimalAbs ani) {
		ani.bark();
	}

	private static void weight() {
		weightAbs guen = new GuenAbs();
		weightAbs pound = new poundAbs();

		int i = 10;

		System.out.println(guen.getGram(i));
		System.out.println(pound.getGram(i));

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

//		eatTest();

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