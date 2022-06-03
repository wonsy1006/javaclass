package javaClass;

// 다형성 (p.305) : 

public class PolymorphismEx1 {

	public static void main(String[] args) {
		// 다형성 X	
		/* Account chulsoo = new Account();
		CheckingAccount gildong = new CheckingAccount();
		CreditLineAccount chanho = new CreditLineAccount(); */
		
		// 자동 형변환 
		Account chulsoo = new CheckingAccount();
		// chulsoo.deposit( ); -> 선언된 클래스의 method만 사용 가능
		Account gildong = new CreditLineAccount(); // override된 메소드 사용 가능
		Account chanho = new DokdoAccount(null, null, 0, 0); // deposit은 override된 method 이용 가능
		
		// 강제 형변환 (Account -> CheckingAccount)
		CheckingAccount younghee = (CheckingAccount)chulsoo;
		
		
	}

}
