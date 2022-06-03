package javaClass;

// 필드의 다형성

public class CarEx1 {	
	
	public static void main(String[] args) {
		Car csMyCar = new Car();	// 인스턴스 객체 생성
		
		for(int i = 1; i <= 10; i++) {
			int problemLocation = csMyCar.run();
			switch(problemLocation) {
				case 1: 
					csMyCar.frontLeftTire = new KeumhoTire("앞왼쪽", 15);
					System.out.println("앞왼쪽 금호타이어로 교체");
					break;
				case 2: 
					csMyCar.frontRightTire = new HankookTire("앞오른쪽", 10);
					System.out.println("앞오른쪽 한국타이어로 교체");
					break;
				case 3: 
					csMyCar.backLeftTire = new HankookTire("뒤왼쪽", 13);
					System.out.println("뒤왼쪽 한국타이어로 교체");
					break;
				case 4: 
					csMyCar.backRightTire = new KeumhoTire("뒤오른쪽", 12);
					System.out.println("뒤오른쪽 금호타이어로 교체"); 
					break;
			} // switch
			
			System.out.println("----------------------------------------");
		}

	}

}
