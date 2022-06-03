package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee = new Account("333-8888-9999", "이영희", 100);
		Account chanho = new Account("777-222-4444", "박찬호", 0);
		
		younghee.deposit(50000);
		chanho.deposit(30000);
		
		younghee.deposit(30000);
		
		try {
			chanho.withdraw(12000);
			printAccount(younghee);
			printAccount(chanho);
			
			printAccount(new Account("999-777-4111", "이영표", 500000)); // 익명으로 account 클래스를 생성
			
		} catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}
		
	} // main
	
	// 통장 정보 출력 메소드
	
	public static void printAccount(Account obj) {
		System.out.println("-------------계좌정보-------------");
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주명 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println("------------------------------------\n");
	}

}
