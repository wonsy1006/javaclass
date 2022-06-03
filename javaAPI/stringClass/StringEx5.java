package javaAPI.stringClass;

public class StringEx5 {

	public static void main(String[] args) {
		
		// Only for English
		
		String original = "Java Programming";
		String lower = original.toLowerCase(); // 문자 모두 소문자로 변환
		String upper = original.toUpperCase(); // 문자 모두 대문자로 변환
		
		System.out.println(lower);
		System.out.println(upper);
	
		// 간단하지만 실무에서 빈번히 사용.
		
		String str = "       자바 프로그래밍       ";
		String newStr = str.trim(); // 문자열 앞뒤 공백 제거
		
		System.out.println(str);
		System.out.println(newStr);
		
		//
		
		String str2 = String.valueOf(10); // valueOf() -> 괄호 안의 데이터를 문자열로 변환
		String str3 = String.valueOf(25.5);
		
		System.out.println(str2 + str3);
		
		// 
		
	}

}
