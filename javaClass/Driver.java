package javaClass;

// 0511 예외 처리 추가

public class Driver {
	// method
	
	public void Drive(Vehicle vehicle) { // 클래스를 매개변수로 설정
		// if(vehicle instanceof Bus) { // instanceof -> 타입을 확인하는 명령
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		// } 
		vehicle.run();
	}
}
