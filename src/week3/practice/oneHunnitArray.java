package week3.practice;

public class oneHunnitArray {
	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
		ex4();
	}

	private static void ex4() {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 1, 2, 3, 4, 5 };  
		System.arraycopy(arr1, 0, arr2, 2, 3);
		for (int i : arr2) {
			System.out.println(i);
		}
	}

	private static void ex3() {

		Man[] people = new Man[9];
		int len = people.length;
		for (int i = 0; i < len; i++) {
//			Man m=new Man("김"+i+"수");
//			people[i]=m;
			people[i] = new Man("김" + (i + 1) + "수");
		}
		for (Man man : people) {
			System.out.println(man);
		}
		System.out.println();

		Man[] people2 = new Man[len];
		for (int i = 0; i < len; i++) {
//			people2[i]=people[i]	// shallow copy
			people2[i] = new Man(people[i].getName()); // deep copy(clone)
		}

		people[0].setName("김11111111");

		System.out.println("1 = " + people[0].getName());
		System.out.println("2 = " + people2[0].getName());

//		people[0].setName("김11111111");
//		for (Man a : people2) {
//			System.out.println(a);
//		}
	}

	private static void ex2() {
		String[] strs = new String[100];
		int len = strs.length;
		for (int i = 0; i < len; i++) {
			strs[i] = "str " + (i + 1);
		}
		printArray(strs);
	}

	private static void ex1() {
		int[] oneHunnit = new int[100];
		for (int i = 0; i < 100; i++) {
			oneHunnit[i] = i + 1;
		}

		printArray(oneHunnit);
	}

	private static void printArray(int[] oneHunnit) {
		for (int i = 0; i < 100; i++) {
			System.out.println(oneHunnit[i]);
		}
	}

	private static void printArray(String[] strs) {
		for (int i = 0; i < 100; i++) {
			System.out.println(strs[i]);
		}
	}
}