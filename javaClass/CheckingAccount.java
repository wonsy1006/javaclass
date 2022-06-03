package javaClass;

//체크카드 클래스

public class CheckingAccount extends Account{ // B extends A -> B(자식)는 A(부모)를 상속
	
	// field
	String cardNo;
	
	// constructor
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		
		super(accountNo, ownerName, balance); // (p. 293) super(매개값, ..., ...) -> 부모의 기본 생성자 호출
		/*this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance; */
		this.cardNo = cardNo;
	}
	
	public CheckingAccount() {
		// super(); 
	}
	
	// method - pays with check card
	int pay(String cardNo, int amount) throws Exception { // 예외 처리
		if(!cardNo.equals(this.cardNo)) { // 입력받은 매개 변수 cardNo가 field의 cardNo와 같지 않을 때
			throw new Exception("카드 번호가 일치하지 않습니다."); // 
		} 
		return withdraw(amount); // 지불한 금액 return
	}
	
}
