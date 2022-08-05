package week3.practice;

public class DoubleArray {
	public static void main(String[] args) {
		int upperStart = 65;
		int lowerStart = 97;

		int[] starts = new int[] { upperStart, lowerStart };
		char[][] arr = new char[2][26];

//		for(int start:starts)
		for (int start = 0; start < starts.length; start++) {
			for (int i = 0; i < 26; i++) {
				int x = i + starts[start];
				if (x == 97)
					System.out.println();
				System.out.print((char) x + " ");
				arr[start][i] = (char) x;
			}
		}

		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (i == 0)
//					arr[i][j] = 'A' + j;
//				else
//					arr[i][j] = 'a' + j;
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (i == 1 && j == 0)
//					System.out.println();
//				System.out.print((char) arr[i][j] + " ");
//			}
//		}
	}
}
