package 자바_3장_배열;

public class Test32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 19;
		arr[4] = 29;
		int sum = 0;
		int smax = 0;
		int smin = 99;
		for (int j=0; j<5; j++) {
			if (smin < arr[j])
				smin = arr[j];
			if (smax < arr[j])
				smax = arr[j];
			sum += arr[j];
		}
		System.out.print("[");
		for (int i = 0; i < 5; i++) {
			if (i == 4)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+", ");
		
			System.out.println(arr[i]);
		}
	}
}
