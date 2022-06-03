package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {
		/* Account chulsoo ; -> 선언
		chulsoo = new Account();  -> 생성 */
		
		Account chulsoo = new Account(); // 인스턴스 객체 생성
		chulsoo.accountNo = "111-222-5555";
		chulsoo.ownerName = "김철수";
		chulsoo.balance = 1000;
		
		Account gildong = new Account();
		gildong.accountNo = "111-333-7777";
		gildong.ownerName = "홍길동";
		gildong.balance = 0;
		
		chulsoo.deposit(5000);
		gildong.deposit(30000);
		
		chulsoo.deposit(20000);
		
		try {
			int amount = gildong.withdraw(70000);
			System.out.println("찾은 금액 : " + amount);
		} catch(BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}
		
	}

}