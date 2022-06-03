package javaException;

// try - catch 

public class ExceptionEx1 {

	public static void main(String[] args) {
		int num1 = 10;
		// int num2 = 2;
		int num2 = 0;
		
		try { 
			int result = num1 / num2;
			
			System.out.println("Result = " + result);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide with 0");
			System.out.println(e.getMessage()); // -> 디폴트 메세지
		}
		
	}

}
