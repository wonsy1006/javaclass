package javaAPI.stringClass;

public class StringEx2 {

	public static void main(String[] args) {
		
		String str = "오늘 코로나 확진자 명단";
		
		int index = str.indexOf("로나코"); // indexOf -> 문자열에서 매개 변수의 위치를 찾음

		System.out.println(index); // 매개 변수가 해당 문자열에 없을 때는 -1을 돌려줌
		
		System.out.println(str.length()); // length -> 문자열의 길이 (공백도 문자에 포함)
		
		if(index != -1) {
			System.out.println("코로나에 대한 얘기군요");
		} else {
			System.out.println("다행히 코로나 얘기가 아니군요");
		}
	}

}
