package SecondVacation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class main {
	public static void main(String args[]) throws SQLException, IOException {
//		TestInterface();
//		total();
//		Calc();

		
	
	
	}

	private static void Calc() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		OperCalcImpl ca=new OperCalcImpl();
		System.out.println(ca.mul(a, b));
		System.out.println(ca.div(a,b));
		System.out.println(ca.add(a, b));
	}

	private static void total() {
		int[] arr=new int[] {1,2,5,9};
		SubTotal st=new SubTotal();
		System.out.println("Total = "+st.sum(arr));
		System.out.println("Average = "+st.avg(arr));
		
	}

	private static void TestInterface() throws SQLException, IOException {
		TestInterface ti=new TestImpl();
		ti.select("select * from Table");
		TestInterface.out(100);
	}

}
 