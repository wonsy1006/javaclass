package javaAPI.objectClass;

// p.466

import java.util.Arrays;

public class Member2 implements Cloneable {
	
	public String name;
	public int age;
	// 참조 타입 필드 (깊은 복제 대상)
	public int[] scores;
	public Car car;
	
	public Member2(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores; // 객체의 주소를 넘겨줌
		this.car = car; // 객체의 주소를 넘겨줌
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복제를 해서 name, age 복제
		Member2 cloned = (Member2)super.clone(); // Object 클래스의 clone() 호출
		// scores 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member2 getMember() { // 리턴 타입이 Member 클래스
		Member2 cloned = null;
		
		try {
			cloned = (Member2) clone(); // Object 클래스에 포함된 메소드. 자기 자신을 복제. 강제 형변환 ->clone 객체는Member 클래스가 아니기 때문.
		} catch (CloneNotSupportedException e) {
			
		}
		
		return cloned; // 복제한 객체를 리턴
	
	}
}
