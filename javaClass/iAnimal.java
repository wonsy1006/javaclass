package javaClass;

// Interface

public interface iAnimal { // 컴파일하면 .class로 저장 Animal 클래스가 존재하기 때문에 iAnimal
	// 인터페이스의 구성 멤버는 상수와 메소드. 객체로 생성할 수 없기 때문에 생성자를 가질 수 없다.
	// 인터페이스 선언 [ public ] interface 인터페이스명 { ... }
	
	// Abstract Method
	void eat(); // abstract 생략 가능 
	
}
