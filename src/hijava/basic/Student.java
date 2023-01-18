package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Student implements Cloneable {

	private int id;
	private String name;

	public Student() {
		this.name = "Guest";
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student clobj = (Student) super.clone();
		clobj.name = clobj.name + " 복제본!";
		return clobj;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 메모리 주소 비교
			return true;
		if (obj == null) // this는 null이 될 수 없으므로 obj가 null이면 false
			return false;
		if (getClass() != obj.getClass()) // 동일한 class type이 아니면 false
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Student s = new Student(161163, "조장호");
//		Student s2=(Student)s.clone();
//		System.out.println(s2);
//		System.out.println(s.getClass());

		String inputStr = "hijava.basic.Student";
		Class<?> cls = Class.forName(inputStr);
		Package pkg = cls.getPackage();
		System.out.println("pkg = " + pkg);

		for (Constructor c : cls.getConstructors())
			System.out.println("constructor = " + c);
		for (Field f : cls.getFields())
			System.out.println("field = " + f);
		for (Method m : cls.getMethods()) {
			System.out.println("method = " + m.getName());
			if ("getName".equals(m.getName())) {
				System.out.println("----------------------");
			}
		}

		Student newStu = (Student) cls.newInstance();
		System.out.println(newStu);
		Method setnameMethod = cls.getMethod("setName", String.class);
		setnameMethod.invoke(newStu, "죠쟝호");
		Method getnameMethod= cls.getMethod("getName");
		System.out.println("newStu.name = "+getnameMethod.invoke(newStu));
		
//		boolean hasCondition = true;
//		String searchStr = "조장호";
//		String s = "select * from Tbl";
//		if (hasCondition) {
//			s = s + "where name like '%" + searchStr + "%";
//			s += "and id > 0";
//			s += "limit 10"; 
//		}
//
//		StringBuilder sb = new StringBuilder();
//		sb.append("select * from Tbl");
//		if (hasCondition) {
//			sb.append("where name like '%").append(searchStr).append("%");
//			sb.append(100).append('T');
//		}

//		sb.append("aaa");
//		System.out.println("sb1 = " + sb.toString());
//		sb.setLength(0);
//		System.out.println("sb2 =  " + sb.toString());
//
//		StringBuffer sf = new StringBuffer();
//		sf.append("aaa");
//		System.out.println("sf1 = " + sf.toString());
//		sf.setLength(0);
//		System.out.println("sf2 = " + sf.toString());

//		System.out.println(s);
//		String ss=new String("조장호");
//		Integer obj = new Integer(s.id);
//		Integer obj2 = new Integer(161163);
//		System.out.println(s.name.hashCode()+"::"+ss.hashCode());
//		System.out.println(obj.hashCode()+"="+obj2.hashCode());
//
//		Student s1 = new Student(123, "Hong");
//		Student s2 = new Student(456, "Kim");
//		Student s3 = new Student(123, "Hong");
//		Student s4 = s1;
//
//		System.out.println("s1 equals s2 = " + s2.equals(s1));
//		System.out.println("s1 equals s3 = " + s3.equals(s1)); 
//		System.out.println("s1 equals s4 = " + s4.equals(s1));
//
//		System.out.println("hong hash = " +s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s4.hashCode());
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s4));

	}
}
