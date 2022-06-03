package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee = new PhysicalInfo("이영희", 10, 135.5F, 38.0F);
		
		printPhysicalInfo(younghee);
		
		younghee.update(11, 145.0F, 48.5F);
		printPhysicalInfo(younghee);
		
		younghee.update(12, 157.0F); // 몸무게 변동 X
		printPhysicalInfo(younghee);
		
		younghee.update(13); // 키, 몸무게 변동 X
		printPhysicalInfo(younghee);
		
	} // main
	
	// 신체 정보 출력
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("---------------------------");
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println("---------------------------\n");
	}

}
