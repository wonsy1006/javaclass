package javaClass;

public class Tire {
	// field
	public int maxRotation;	// 타이어 수명
	public int accumulatedRotation;	// 누적 회전수
	public String location;	// 타이어의 위치
	
	// constructor
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// method
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 타이어의 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " 타이어 펑크 ***");
			return false;
		}
	}
	
}
