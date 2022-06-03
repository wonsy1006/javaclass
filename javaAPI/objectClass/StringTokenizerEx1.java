package javaAPI.objectClass;

import java.util.StringTokenizer;

// p.512 StringTokenizer Class

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		String str = "홍길동*김철수/이영희,박찬호";
		StringTokenizer st = new StringTokenizer(str, "*|/|,");
		
		// how 1 : 전체 토큰 수를 얻어 for문으로 루핑

		/* int countTokens = st.countTokens();
		
		for(int i = 0; i < countTokens; i++) {
			String name = st.nextToken();
			System.out.println(name);
		} */
		
		// how 2 : 남아 있는 토큰을 확인하고 while문으로 루핑
		
		while(st.hasMoreTokens()) { // 남아 있는 토큰이 있는지 여부. 있으면 true.
			String name = st.nextToken();
			System.out.println(name);
		}
	}

}
