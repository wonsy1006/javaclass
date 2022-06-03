package javaAPI;

// p.514	 StringBuffer, StringBuilder Class

public class StringBuilderEx1 {

	public static void main(String[] args) {
		/*
		String data = "korea ";
		data += "fighting "; // line6의 참조 주소와 다른 새로운 주소 확보
		data += "corona"; // line7의 참조 주소와 다른 새로운 주소 확보 -> String 객체 수가 늘어나고 프로그램 성능 저하의 요인이 됨.
		System.out.println(data);
		*/
		
		// StringBuilder -> 단일 스레드에서 이용. 임시 기억 장소 활용.
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java "); // append -> 문자열을 끝에 추가
		sb.append("Pregram Study");
		System.out.println(sb.toString()); // toString -> 실제 버퍼 안의 문자열을 찾아감
		
		sb.insert(12, "ning"); // insert -> index 12 뒤에 문자열 ming을 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(12, 'm'); // setCharAt -> index12 위치의 문자를 m으로 변경
		System.out.println(sb.toString());
		
		// 연습
		sb.setCharAt(7, 'o');
		System.out.println(sb.toString());
		
		sb.replace(5, 16, "API"); // replace -> index5부터 index16'전'까지를 "API" 문자열로 대치
		System.out.println(sb.toString());
		
		sb.delete(4, 8); // delete -> index4부터 index8'전'까지 삭제
		System.out.println(sb.toString());
		
		int length = sb.length(); // -> 총 문자수 얻기
		System.out.println("총 문자수 : " + length);
		
		String result = sb.toString(); // 버퍼에 있는 값을 String 타입으로 리턴
		System.out.println(result);
	}

}
