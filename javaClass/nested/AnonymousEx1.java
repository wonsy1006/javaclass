package javaClass.nested;

// p.408

public class AnonymousEx1 {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		anony.pField.wake();
		
		// 익명 객체 매개값 사용
		anony.method1(new Person() {
			void study() {
				System.out.println("I study.");
			}
			@Override
			void wake() {
				System.out.println("I get up at 8.");
				study();
			}
		});
		
		// 익명 객체 로컬 변수 사용
		anony.method2();
	}

}
