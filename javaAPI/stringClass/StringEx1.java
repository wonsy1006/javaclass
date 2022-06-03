package javaAPI.stringClass;

public class StringEx1 {

	public static void main(String[] args) {
		/*
		String str = "Java Programming";
		// String str = new String("Java Programming");
		
		char ch = str.charAt(5); // charAt : 해당 위치의 문자를 출력
		System.out.println(ch);
		*/

		String ssn = "980520-1234567";
		
		char ch = ssn.charAt(7);
		
		if(ch == '1' || ch == '3') { // char은 ' ' 사용
			System.out.println("남성");
		} else if(ch == '2' || ch == '4') {
			System.out.println("여성");
		} else {
			System.out.println("잘못된 주민등록번호입니다.");
		}
		
	}

}
