package edu.ruby.java.ch07.abstraction;

public interface Messenger {

	public static final int Min_Size = 1;
	public static final int Max_Size = 104857600;
	
	public abstract String getMessage();
	
	public abstract void setMessage(String msg);
	
	public default void setLogin(boolean login) {
		log();
		if(login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다.");
		}
	}
	
	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}
	
	private void log() {
		System.out.println("start job!");
	}
	
}
