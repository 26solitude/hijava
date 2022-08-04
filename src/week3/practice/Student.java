package week3.practice;

public class Student {
	private String studentNo;
	private String name;
	private int age;
	private String telNo;

	public Student() {
		studentNo="hi";
		name="bye";
		age=19;
		telNo="0103573182";
	}

	public Student(String name) {
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 010-9770-5190 -> 010-9770-
	public String getTelNo() {
		if (this.telNo == null || telNo.length() < 4) {
			return telNo;
		} else {
			return telNo.substring(0, telNo.length() - 4);
		}
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", telNo=" + telNo + "]";
	}

}
