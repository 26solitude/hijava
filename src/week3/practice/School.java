package week3.practice;

public class School {
	public static void main(String[] args) {
		Score korean = new Score();
		korean.setSubject("국어");
		korean.setScore(90);

		System.out.println(korean);

//		System.out.println(korean.toString());

//		String k = korean.toString();
//		System.out.println(k);

		Score math = new Score("수학", 80);
		System.out.println(math.toString());

		Score science=new Score("과학");
		System.out.println(science);
		
		Student s1 = new Student("김찬호");
		s1.setTelNo("010-9770-5190");
		System.out.println(s1.getTelNo());
	}
}
