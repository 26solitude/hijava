package week3.practice;

public class HelloJava {

	public static void main(String[] args) {
		HelloJava.say("Hi Java!");
//		JVM�� ������ ȭ�鿡 ���
		say("Hello Java!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}
}