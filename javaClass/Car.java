package javaClass;

public class Car {
	// field
		Tire frontLeftTire = new Tire("앞왼쪽", 7);
		Tire frontRightTire = new Tire("앞오른쪽", 3);
		Tire backLeftTire = new Tire("뒤왼쪽", 5);
		Tire backRightTire = new Tire("뒤오른쪽", 4);
		
		// constructor
		// 따로 생성하지 않으면 디폴트 생성자
		
		// method
		int run() {
			System.out.println("자동차가 달립니다.");
			if(frontLeftTire.roll() == false) {
				stop(); 
				return 1;
			}
			if(frontRightTire.roll() == false) {
				stop();
				return 2;
			}
			if(backLeftTire.roll() == false) {
				stop();
				return 3;
			}
			if(backRightTire.roll() == false) {
				stop();
				return 4;
			}
			return 0;
		}
		
		void stop() {
			System.out.println("자동차가 멈춥니다.");
		}
}
