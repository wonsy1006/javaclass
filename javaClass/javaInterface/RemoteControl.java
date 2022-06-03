package javaClass.javaInterface;

// remote control interface

public interface RemoteControl {
	// Constant
	// static final 생략 -> interface는 상수밖에 없기 때문
	public int MAX_VOLUME = 10;  
	public int MIN_VOLUME = 0;
	
	// Abstract Method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// ~JAVA 8
	// Default Method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// Static Method -> 구현 클래스와 관계 없이 인터페이스 자체에서 사용
	static void changeBattery() {
		System.out.println("리모콘의 건전지를 교환합니다.");
	}
}
