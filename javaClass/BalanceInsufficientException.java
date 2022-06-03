package javaClass;

// p.440 사용자 정의 예외처리

public class BalanceInsufficientException extends Exception{
	
	// constructor
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
