package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Student implements Cloneable {
	private int id;
	private String name;
	
	public Student()
	{
		this.name="Guest";
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getSno() {
		return id;
	}

	public void setSno(int sno) {
		this.id = sno;
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
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// if(s1!=null && s1.equals(s2)) {
	@Override
	public boolean equals(Object obj) {
		// 동일한 메모리 주소면 true
		if (this == obj)
			return true;

		// this는 절대 null이 될 수 없으므로 obj null이면 false!!
		if (obj == null)
			return false;

		// 동일한 class type이 아니면 false
		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (this.id != other.id)
			return false;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		return true;

//		Student other = (Student) obj;
//		return this.id == other.id && this.name != null && this.name.equals(other.name);
	}

	public Object clone() throws CloneNotSupportedException {
		Student clobj = (Student) super.clone();
		clobj.name = clobj.name + " 복제본!";
		return clobj;
	}

	public static void main(String[] args)
			throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

//		Student s = new Student(161163, "조장호");
//		System.out.println(s.getClass()+", "+s.getClass().getSimpleName());

		String inputStr = "hijava.basic.Student";
		Class<?> cls = Class.forName(inputStr);
		Package pkg = cls.getPackage();
		System.out.println("pkg = " + pkg);

		for (Constructor c : cls.getConstructors())
			System.out.println("constructor = " + c);
		for (Field f : cls.getFields())
			System.out.println("Field = " + f);
		for (Method m : cls.getMethods()) {
			System.out.println("Method = " + m.getName());
			if("getName".equals(m.getName()))
			{
				System.out.println("-------------------");
			}
		}
		
		System.out.println();
		Student newStu=(Student)cls.newInstance();
		System.out.println(newStu);
		Method setnameMethod = cls.getMethod("setName", String.class);
		setnameMethod.invoke(newStu, "죠쟝호");
		Method getnameMethod= cls.getMethod("getName");
		System.out.println("newStu.name = "+getnameMethod.invoke(newStu));
		
		Method setidMethod=cls.getMethod("setSno", int.class );
		setidMethod.invoke(newStu, 200);
		System.out.println(newStu);
		
//		Student s2=(Student)cls.newInstance();

//		boolean hasCondition=true;
//		String searchStr="조장호";
//		String s="select * from Tbl where";
//		if(hasCondition)
//		{
//			s=s+"where name like %"+searchStr+"%";
//			s+=" and id > 0";
//			s += " limit 10";
//		}
//		System.out.println(s);
//		
//		StringBuilder sb=new StringBuilder();
//		sb.append("select * from Tbl");
//		if(hasCondition)
//		{
//			sb.append(" where name like %").append(searchStr).append("%");
//			sb.append(100).append('T');
//		}
//		System.out.println(sb);

//		StringBuilder sb = new StringBuilder();
//		sb.append("aaaaaa");
//		System.out.println("sb1 = " + sb.toString());
//		sb.setLength(0);
//		System.out.println("sb2 = " + sb.toString());
//
//		StringBuffer sf = new StringBuffer();
//		sf.append("aaaaaa");
//		System.out.println("sb1 = " + sf.toString());
//		sf.setLength(0);
//		System.out.println("sb2 = " + sf.toString());

//		Student s1 = new Student(161163, "조장호");
//		Student s2= (Student) s1.clone();
//		System.out.println(s1);
//		System.out.println(s2);

//		Student s2 = new Student(181163, "손정동");
//		Student s3 = new Student(161163, "조장호");
//		Student s4 = s1;
//		System.out.println(s1);
//		String ss = new String("조장호");
//		Integer obj = new Integer(s1.id);
//		Integer obj2 = new Integer(161163);
//		System.out.println(s1.name.hashCode() + "::" + ss.hashCode());
//		System.out.println(obj.hashCode() + "::" + obj2.hashCode());
//		System.out.println();
//
//		System.out.println("s1 equals s2 = " + s2.equals(s1));
//		System.out.println("s1 equals s3 = " + s3.equals(s1));
//		System.out.println("s1 equals s4 = " + s4.equals(s1));
//		System.out.println();
//
//		System.out.println(s1.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//		System.out.println();
//
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s3));
//		System.out.println(System.identityHashCode(s4));
//		System.out.println();
	}
}
