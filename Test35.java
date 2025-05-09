package 자바_3장_배열;

public class Test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for (int n: arr)
			System.out.print(n+" ");
		
		double[] arr = {1.1,2.2,3.3,4.4,5.5}
		for (double x : arr)
			System.out.println(x+" ");
		for (int i=0;i<arr.length;i++) {
			if (arr[i] > 3.3)
				System.out.print(arr[i]+" ");
		}
	}

}
