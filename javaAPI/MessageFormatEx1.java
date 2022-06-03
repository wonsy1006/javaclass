package javaAPI;

import java.text.MessageFormat;

// p.547 MessageFormat Class

public class MessageFormatEx1 {

	public static void main(String[] args) {
		String id = "hong";
		String name = "홍길동";
		String tel = "010-7777-7777";
		String text = "회원 ID : {0} \n회원 이름 : {1} \n전화번호 : {2}";
		String result = MessageFormat.format(text, id, name, tel); // 첫 번째 매개값은 매개 변수화된 문자열을 지정, 두 번째 이후의 매개값은 인덱스 순서에 맞게 값을 나열
			
		System.out.println(result);
		
		text = "{0} 회원님 오늘 부탁하신 제품은 {0} 회원님이 원하신 제품이 아니라";
		result = MessageFormat.format(text, name);
		
		System.out.println(result);
		
	}

}
