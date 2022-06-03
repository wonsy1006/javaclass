package javaAPI;

// p.527 Wrapper Class
// 기본 타입이지만 객체처럼 주소가 있고 실제로 찾아가야 값이 있음

public class WrapperEx1 {

	public static void main(String[] args) {
		// 객체 Integer 생성
		Integer obj1 = new Integer(10); // 취소선 -> 구버전에서 사용되던 방식일 경우
		Integer obj2 = 20; // 자동 박싱(Java 5부터) 
		
		System.out.println(obj2.intValue());
		
		// 대입 시 자동 Unboxing
		int value1 = obj1; // int는 primitive type 이고 obj1은 객체라 오류가 나야 하지만 안 남 -> 자동 언박싱을 해주었기 때문
		
		String str1 = "20";
		String str2 = "2.54";
		
		int value2 = Integer.parseInt(str1);
		double value3 = Double.parseDouble(str2);
		
	}

}
