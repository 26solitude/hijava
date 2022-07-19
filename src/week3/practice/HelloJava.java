package week3.practice;

public class HelloJava {

	public static void main(String[] args) {
		HelloJava.say("Hi Java!");
//		JVM이 스스로 화면에 출력
		say("Hello Java!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}