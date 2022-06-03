package javaClass;

// 매개변수의 다형성
// 0511 예외 처리 추가

public class DriverEx1 {

	public static void main(String[] args) {
		
		try {
			
			Driver chulsoo = new Driver();
			
			Taxi taxi = new Taxi();
			Truck truck = new Truck();
			Bus bus = new Bus();
			
			chulsoo.Drive(bus);
			System.out.println();
			chulsoo.Drive(taxi); 
			
		} catch (ClassCastException e) {
			System.out.println("타입 변환을 할 수 없습니다.");
		}
		
		/*
		chulsoo.Drive(taxi); // overriding method 수행
		chulsoo.Drive(truck);
		chulsoo.Drive(bus);
		*/

	}

}
