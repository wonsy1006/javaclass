package javaClass;

public class iCat implements iAnimal{
	// public class 구현클래스명 implements 인터페이스명 -> 인터페이스에 선언된 추상 메소드의 실체 메소드 선언
	
	// 부모가 가진 메소드를 구현클래스에서 구현
	@Override
	public void eat() {
		System.out.println("Cats like fish");
	}
	
}
