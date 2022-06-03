package javaAPI.stringClass;

// p.511 split() 메소드 -> String Class에 포함

public class SplitEx1 {

	public static void main(String[] args) {
		String text = "김철수,이영희*홍길동#박찬호&이영표";
		String[] names = text.split(",|\\*|#|&"); // 매개 변수에 입력된 문자열을 구분자로 텍스트를 나눠 줌
		
		// \\ -> 정규식 표현에서 연산자로 쓰이는 특수문자는 구분자로 쓰이지 못함. 구분자 앞에 \\ 를 써주면 사용 가능.
		
		for(String na: names) { // 향상된 for문 ( 타입 변수명 : 배열명)
			System.out.println(na);
		}
		
		// split과 StringTokenizer의 차이 -> split은 정규 표현식으로 구분. StringTokenizer는 문자로 구분
	}

}
