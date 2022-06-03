package javaClass;

//(p.295) 메소드 재정의(Override)
//오버로딩과 헷갈리지 않게 주의! 백엔드에서는 오버라이딩을 더 많이 사용

//마이너스 통장
public class CreditLineAccount extends Account {
	
	// field
	int creditLine;		// 마이너스 한도
	
	// constructor
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance); // 부모 생성자를 호출
		this.creditLine = creditLine;
	}
	
	public CreditLineAccount() {
		
	}
	
	// deposit()는 그대로 사용
	// method 재정의
	
	@Override // Annotation(p.269) -> 오타 방지 
	int withdraw(int amount) throws BalanceInsufficientException { // override
		if((balance + creditLine) < amount) {
			throw new BalanceInsufficientException("인출이 불가능합니다.");
		} else {
			balance -= amount;
			return amount;
		}
	}
	
	
}
