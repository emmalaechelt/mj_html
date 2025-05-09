package edu;

public class Test011 {
	
	public static void main(String[] args) {
		System.out.println(addNumber(1));
		System.out.println(addNumber(1, 2));
		System.out.println(addNumber(1, 2, 3));
		System.out.println(addNumber(1, 2, 3, 4));
	}
	public static int addNumber(int...v) {
		System.out.print("합" + v.length + " : ");
	    int sum = 0;
	    
		for(int x : v) {
			sum += x;
			System.out.print(x + " ");
	}
	
		System.out.print(" => "); 
		return sum;
	
	}
}
