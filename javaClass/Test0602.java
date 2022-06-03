package javaClass;

public class Test0602 {
	// field (5개 정도)
	String accountNo; 	// 계좌번호
	String ownerName;	// 예금주
	int balance;				// 잔고
	
	// * 소수점이 필요한 필드 -> double 타입 사용
	
	// constructor
	public Test0602(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// method
	void deposit(int amount) {
		balance += amount;
	}
	
	// 예외처리는 안 해도 되나?
	int withdraw(int amount) throws BalanceInsufficientException  {
		if(amount > balance) {
			throw new BalanceInsufficientException("잔액이 부족합니다. ( " + (amount - balance) + "원 부족 )");
		}
		
		balance -= amount;
		return amount;
	}
	
}
