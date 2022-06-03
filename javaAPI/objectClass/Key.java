package javaAPI.objectClass;

// Object class 는 모든 클래스의 부모 오브젝트. 따로 상속하지 않아도 됨.

public class Key {
	
	// field
	public int number;
	
	// hashcode p.461
	
	// constructor
	public Key(int number) {
		this.number = number;
	}
	
	// method
	
	@Override // 재정의
	public boolean equals(Object obj) { // Object obj -> 모든 객체를 다 받을 수 있음.
		if(obj instanceof Key) { // 매개 변수 obj가 객체 타입이 Key 클래스인지 판별
			Key compareKey = (Key) obj; // 강제 타입 변환
			if(this.number == compareKey.number) {
				return true; 
			}
		}
		return false;
	}
	
	@Override
		public int hashCode() {
		return number; 
	}
	
}
