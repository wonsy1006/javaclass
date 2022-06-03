package javaException;

// 실제 개발 시 제일 많이 발생하는 Exception

public class ExceptionEx4 {
	
	public static void main(String[] args) {
		
		try {
			
			String data1 = "100";
			String data2 = "a200";
			
			System.out.println(data1 + data2); // -> + : 연결 연산자
			
			int value1 = Integer.parseInt(data1); // Integer 클래스의 parseInt 메소드 : int 값으로 변환
			int value2 = Integer.parseInt(data2);
			
			System.out.println(value1 + value2);
			
		} catch (NumberFormatException e) {
			
			System.out.println("숫자로 변환할 수 없습니다.");
			
		}
		
	}
	
}
