package javaClass;

public class HankookTire extends Tire {
	// field
	// 생성하지 않으면 부모 필드 사용
	
	// constructor
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// method
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " 한국타이어의 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " 한국타이어 펑크 ***");
			return false;
		}
	}
	
}
