package javaClass;

public class KeumhoTire extends Tire{
	// field
	// 생성하지 않으면 부모 필드 사용
		
	// constructor
	public KeumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
		
	// method
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 금호타이어의 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " 금호타이어 펑크 ***");
			return false;
		}
	}
}
