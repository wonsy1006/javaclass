package javaAPI.stringClass;

public class StringEx4 {

	public static void main(String[] args) {
		String str = "computer";
		
		String sub1 = str.substring(5); // substring(인덱스) -> 매개 변수에 넣은 인덱스 이후의 문자들을 출력
		String sub2 = str.substring(2, 5); // substring(시작 인덱스, 끝 인덱스) -> 시작 인덱스부터 끝 인덱스 사의 문자들 출력
		
		System.out.println(sub1); 
		System.out.println(sub2);
		
		// 문제 : 주민등록번호 뒤 7자리 가리기
		String ssn = "920812-1234567";
		
		// 내가 푼 거
		System.out.println(ssn.substring(0, 7) + "*******");
		
		// 다른 답
		String newSsn = ssn.replace(ssn.substring(7), "*******");
		System.out.println(newSsn);
		
	}

}
