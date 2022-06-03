package javaClass;

public abstract class Animal { // abstract -> 추상 클래스
	// 추상 클래스는 new로 인스턴스 객체 생성할 수 없음
	// field
	String name;
	
	// abstract method
	abstract void move(); // 메소드 본체({ }) 가 없
}
