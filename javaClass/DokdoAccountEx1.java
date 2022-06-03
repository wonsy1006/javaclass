package javaClass;

public class DokdoAccountEx1 {

	public static void main(String[] args) {
		DokdoAccount chulsoo = new DokdoAccount("111-22-5555", "김철수", 0, 0);
		
		chulsoo.deposit(10000);
		System.out.println("잔액 : " + chulsoo.balance);
		System.out.println("독도사랑기금 : " + chulsoo.point);
		
		chulsoo.deposit(50000);
		System.out.println("잔액 : " + chulsoo.balance);
		System.out.println("독도사랑기금 : " + chulsoo.point);

	}

}
