package javaClass;

public class CreditLineAccountEx1 {	
	
	public static void main(String[] args) {
		CreditLineAccount sundal = new CreditLineAccount("111-555-7477", "Sundal Kim", 10, 1000000);
		
		sundal.deposit(100); // 부모(Account.java)로부터 상속
		
		try {
			int amount = sundal.withdraw(500000);
			System.out.println("찾은 금액 : " + amount);
			System.out.println("balance : " + sundal.balance);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		}

	}

}
