package javaClass;

public class Tiger	extends Animal {
	// 필드 String name 도 사용 가능
	int age;
	
	@Override
	void move() { // method 본체는 자식 클래스에서 구현
		System.out.println("네 발로 이동합니다.");
	} 
	
}
