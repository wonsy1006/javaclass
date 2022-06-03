package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

// p.517 Regular Expression

public class PatternEx1 {

	public static void main(String[] args) {
		/*
		System.out.println("철수가 말했다. \"안녕\" 이라고"); // \ -> 이스케이프 문자
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 전화번호 검증
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; // -> "" 안에서는 \\를 써야 \를 출력
		
		System.out.print("전화번호 입력 >> ");
		String tel = sc.next();
		
		boolean result = Pattern.matches(regExp, tel);
		if(result) {
			System.out.println("올바른 전화번호입니다.");
		} else {
			System.out.println("전화번호 형식이 올바르지 않습니다.");
		}
		
		// 이메일 검증
		System.out.print("이메일 입력 >> ");
		String email = sc.next();
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";  
		result = Pattern.matches(regExp, email);
		
		if(result) {
			System.out.println("올바른 이메일주소입니다.");
		} else {
			System.out.println("이메일 주소 형식이 올바르지 않습니다.");
		}
	
	}

}
