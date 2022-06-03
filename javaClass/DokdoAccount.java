package javaClass;

//  독도 사랑 통장

public class DokdoAccount extends Account{
	
	// field
	int point;	// 기금 포인트 0.1%
	
	// constructor
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance); // 부모 생성자 호출
		this.point = point;
	}
	
	// method
	@Override
	void deposit(int amount) {
		super.deposit(amount); // 부모 메소드 호출
		point += (int)(amount*0.001); // 0.001은 double이기 때문에 int로 강제 형변
	}
}
