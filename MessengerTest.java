package edu.ruby.java.ch08.innerClass;

import com.ruby.java.ch07.abstraction.Messenger;

public class MessengerTest {
	public static void main(String[] args) {
		
		Messenger test = new Messenger() {
		
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다 : " + msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		//
		System.out.println(test.getMessage());
		test.setMessage("have a nice day!");
	}
}
