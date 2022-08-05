package week3.practice;

public class Man {
	public static final int COFFEE = 3000;
	public final static int DONUT = 2500;

	private String name;
	private int money;

	public Man() {
		this.money = 10000;
	}

	public Man(String name) {
		this();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String toString() {
		return this.name+"님의 잔액은 " + this.money + "원 입니다.";
	}

	private void buyCoffee(int count) {
//		this.money -= COFFEE * count;
		this.subAmount(COFFEE, count);
	}

	private void buyDonut(int count) {
//		this.money -= DONUT * count;
		this.subAmount(DONUT, count);
	}

	private void subAmount(int price, int count) {
		this.money -= price * count + (price * count) * 0.1;
	}

	public static void main(String[] args) {
		Man hong = new Man("hong");
		System.out.println(hong);
		hong.buyCoffee(1);
		hong.buyDonut(2);
		System.out.println(hong);

		System.out.println();

		Man john = new Man("john");
		System.out.println(john);
		john.buyCoffee(2);
		john.buyDonut(1);
		System.out.println(john);

		System.out.println();
	} 

}
