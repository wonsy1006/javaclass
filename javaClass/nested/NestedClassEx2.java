package javaClass.nested;

public class NestedClassEx2 {

	public static void main(String[] args) {
		
		// ClassA의 내부 정적 클래스 객체 생성. ClassA 먼저 생성하지 않아도 됨.
		ClassA.ClassC cc = new ClassA.ClassC();
		cc.fieldC = 30;
		cc.methodC(); // 메소드
		
		ClassA.ClassC.fieldC2 = 20; // static field 접근 방식
		ClassA.ClassC.methodC2(); // static method 접근 방식
		
	}

}
