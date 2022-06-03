package javaClass;

public class CheckingAccountEx1 {

	public static void main(String[] args) {
		CheckingAccount chulsoo = new CheckingAccount("111-22-5555", "김철수", 1000, "1111-2222-3333-4444");
		
		chulsoo.deposit(30000);
		
		// pay()에 예외처리를 했으므로 try ... catch로 받아야 함
		try {
			int paidAmount = chulsoo.pay("1111-2222-3333-4444", 15000);
			System.out.println("지불한 금액 : " + paidAmount);
			System.out.println("잔액 : " + chulsoo.balance );
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
