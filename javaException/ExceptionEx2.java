package javaException;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			// String name = "Alex"
			String name = null; // p.139, p.149 
			System.out.println("Name : " + name.toString()); // 객체의 문자 정보 리턴
		} catch (NullPointerException e) {
			System.out.println("문자 정보를 가져올 수 없습니다.");
		}

		/*
		 * null값을 넣었기 때문에 참조 가능한 문자 정보 없음
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "name" is null
		 * at javaException.ExceptionEx2.main(ExceptionEx2.java:8)
		 */
	}

}
