package javaClass;

public class VehicleEx1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); 	// 자동 타입 변환
		vehicle.run(); // Bus에서 override한 run이 수행됨
		// Bus bus = vehicle; ->  cannot convert from vehicle to bus
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
