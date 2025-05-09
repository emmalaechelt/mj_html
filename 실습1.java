package 자바_3장_배열;

public class 실습1 {

	public static void main(String[] args) {
		int[] score;
		score = new int[] {49, 91, 87, 67, 73};
  
		int s1 = 49;
		int s2 = 91;
		int s3 = 87;
		int s4 = 67;
		int s5 = 73;
		
		System.out.println("평균 :" + avg(s1, s2, s3, s4, s5));
		System.out.println("최대 :" + max(s1, s2, s3, s4, s5));
		System.out.println("최소 :" + min(s1, s2, s3, s4, s5));
	}

	 static int avg(int... v) {
		   int sum = 0;
		   for (int x : v)
			   sum += x;
	     }
	       return sum/v.length
		   
	}

		/*
		 * 배열 사용없이 변수 5개를 사용하여 5명 점수의 평균 구하기
		 * int score1,score2,score3, score4, score5;
		 */
		//5명 점수를 score1 등의 변수로 초기화: 49, 91, 87, 67, 73
		//최대 점수, 최소 점수, 평균 점수 계산하는 코드 구현
