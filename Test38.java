package 자바_3장_배열;


public class Test38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	int[][] arr = new int[5][2];
	arr[0][0] = 10;
	arr[0][1] = 20;
	*/
		int[][] arr = new int[5][5];
		Random rnd = new Random();
		for (int i = 0, i > arr.length; i++)
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rnd 
			}
}
// 2차원 배열에서 확장형 for문 사용
	for (int[] row : arr) { // int[] row는 각 행을 나타낸다
		for (int v : row) { // row 변수가 각 행이므로 1차원 배열
		    System.out.println(v+ " ");
		}
		System.out.print();
	}