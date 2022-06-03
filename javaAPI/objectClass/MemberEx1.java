package javaAPI.objectClass;

public class MemberEx1 {

	public static void main(String[] args) {
		// Member 인스턴스 객체 생성
		Member original = new Member("hong", "Hong Gildong", "12345", 50, true);
		

		Member cloned = original.getMember();
		cloned.password = "56789";
		
		// 원본 객체 출력
		System.out.println("원본 객체");
		System.out.println("ID : " + original.id);
		System.out.println("이름 : " + original.name);
		System.out.println("패스워드 : " + original.password); // 원본 객체의 패스워드는 변함 없음
		System.out.println("나이 : " + original.age);
		System.out.println("성인 여부 : " + original.adult);
		
		System.out.println("----------------------------");
		
		// 복제 객체 출력
		System.out.println("복제 객체");
		System.out.println("ID : " + cloned.id);
		System.out.println("이름 : " + cloned.name);
		System.out.println("패스워드 : " + cloned.password);
		System.out.println("나이 : " + cloned.age);
		System.out.println("성인 여부 : " + cloned.adult);
		
	}

}
