package javaClass.nested;

public class NestedClassEx1 {

	public static void main(String[] args) {
		ClassA aa = new ClassA(); // 인스턴스 ClassA 객체 생성
		aa.fieldA = 30;
		aa.methodA();
		
		// ClassA의 내부 클래스 ClassB 생성. 반드시 외부 클래스가 먼저 생성되어야 함
		ClassA.ClassB bb = aa.new ClassB(); // 인스턴스 ClassB 객체 생성
		bb.fieldB = 50;
		bb.methodB();
		
	}

}
