package week3.practice;

public class HelloJava {

	public static void main(String[] args) {
		HelloJava.say("Hi Java!");
//		한글 제대로 되는지 테스트
		say("Hello Java!");
		int a=10;
		System.out.println(a);
	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}