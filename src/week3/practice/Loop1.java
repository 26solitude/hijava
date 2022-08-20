package week3.practice;

public class Loop1 {

	public static void main(String[] args) {
		int i=0;
		while(i<10)
		{
			i++;
			
			if(i>5) break;
			
			if(i%2==0) continue;
			
			System.out.println("TTTTTTTTTT >> "+i);
		}
	}

}
