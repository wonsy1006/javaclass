package javaAPI.stringClass;

public class StringEx3 {

	public static void main(String[] args) {
		/*
		// 위치값은 한글과 영문 동일. 바이트 수를 얻으려면 getBytes(); 사용
		String str1 = "안녕하세요"; 
		String str2 = "hello";
		
		byte[] bytes1 = str1.getBytes();
		byte[] bytes2 = str2.getBytes();
		
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println(bytes1.length);
		System.out.println(bytes2.length);
		*/
	
		String str = "지금은 자바의 API에 대해 배우고 있습니다. 자바는 풍부한 라이브러리를 제공합니다.";
		String newstr = str.replace("자바", "Java"); // replace(old char, new char) -> 문자열에서 old char를 찾아 new char로 치
		
		System.out.println(str);
		System.out.println(newstr);
		
		String intro = "내 나이는 25세이고 키는 170cm이고 몸무게는 55kg입니다.";
		String newIntro = intro.replaceAll("[0-9]", "*"); // replaceAll -> 정규표현식, 교체할 문자
		System.out.println(newIntro);
		
		String hello = "안녕하세요. 반가워요. 잘 가세요.";
		String newHello = hello.replaceAll("\\.", "^^"); 
		// String newHello = hello.replaceAll(".", "^^"); // . -> 모든 문자
		System.out.println(newHello);
	}

}
