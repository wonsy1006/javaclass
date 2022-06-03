package javaAPI.objectClass;

public class Member2Ex1 {

	public static void main(String[] args) {
		// Member2 인스턴스 객체 생성
		Member2 original = new Member2("Hong Gildong", 50, new int[] {90,70,88}, new Car("Sonata")); 
		Member2 cloned = original.getMember();
		
		cloned.scores[1] = 90; 
		cloned.car.model = "BMW";
		
		// 원본 객체 출력
		System.out.println("원본 객체");
		System.out.println("이름 : " + original.name);
		System.out.println("나이 : " + original.age);
		System.out.println("국어 점수 : " + original.scores[0]);
		System.out.println("영어 점수 : " + original.scores[1]);
		System.out.println("수학 점수 : " + original.scores[2]);
		System.out.println("자동차 모델 : " + original.car.model);
				
		System.out.println("----------------------------");
				
		// 복제 객체 출력
		System.out.println("복제 객체");
		System.out.println("이름 : " + cloned.name);
		System.out.println("나이 : " + cloned.age);
		System.out.println("국어 점수 : " + cloned.scores[0]);
		System.out.println("영어 점수 : " + cloned.scores[1]);
		System.out.println("수학 점수 : " + cloned.scores[2]);
		System.out.println("자동차 모델 : " + cloned.car.model);
	}

}
