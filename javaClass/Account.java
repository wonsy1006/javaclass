package javaClass;

//클래스 설계도
//은행 계좌 클래스(통장)
public class Account { // 클래스 첫 글자는 무조건 대문자
//class Account -> 접근 제한자 default로 인식	
	
	// 필드
	static final String BANKNAME = "신한은행"; // static final -> 상수 : 변경할 수 없는 값, 객체가 생성되지 않더라도 원본 클래스 자체에서 접근이 가능.
	String accountNo; // 계좌 번호
	String ownerName; // 예금주 이름
	int balance; // 잔액
	
	// 생성자
	// 생성자를 만들지 않으면 default 생성자, 개발자가 생성자를 만들면 default 생성자는 기능 X
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo; // this -> 객체 자신의 참조
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 디폴트 생성자 (ctrl + enter -> constructor) 보통 개발자가 생성자를 만들면 디폴트 생성자는 필요 X
	public Account() {
		
	}
	
	// 메소드 *제일 중요한 것
	// 예금한다
	void deposit(int amount) { // void : 리턴 값이 없다, 메소드명 : 개발자가 지정, ( ) : 매개 변수(맡길 돈을 전달)
		balance += amount;
	}

	// 인출한다
	int withdraw(int amount) throws BalanceInsufficientException { // Artificial Exception : 개발자가 임의로 만드는 Exception
		if(balance < amount) {
			throw new BalanceInsufficientException("잔액이 부족합니다. ( " + (amount - balance) + "원 부족 )");
		} 
		
		balance -= amount;
		return amount;
		
	}
	
}
