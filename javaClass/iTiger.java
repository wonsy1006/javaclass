package javaClass;

public class iTiger extends Animal implements iAnimal{
	// Animal 클래스를 상속 받고 iAnimal의 메소드를 구현
	
	@Override
	public void eat() {
		System.out.println("Tigers eat pigs");
		
	}

	@Override
	void move() {
		// Animal 클래스는 추상 클래스
		System.out.println("Tigers move with four feets");
	}
	
}
