package 자바_3장_배열;

public class Test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 등차수열 An = 3 + (n-1)2
		// A1 = 3 
		// A2 = 3 + 2 = 5
		// A3 = 3 + 2*2 = 7
		// 
		System.out.print("[");
		int[] arr = new int [10];
		for (int i = 0; i < 10; i++) {
			// an = 3 + (n-1)*2
		}
			arr[i] = 3 + (i+1-1)*2;
			
		for (int i = 0, i <10; i++)
			if (i == 9)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+", ");
		System.out.println("]");
		}
		
	
	
