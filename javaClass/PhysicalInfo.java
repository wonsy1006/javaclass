package javaClass;

//신체 정보를 기록하는 클래스
public class PhysicalInfo {
	// 필드
	String name;  // 이름
	int age;            // 나이
	float height, weight;   // 키, 몸무게
	
	// 생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;       
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드
	void update(int age) { // (p.230) 메소드 오버로딩(overloading) : 클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
		this.age = age;           // 조건 : 매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다. 
	}
	
	void update(int age, float height) { 
		this.age = age;								  
		this.height = height;
	}
	
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
