package javaAPI.objectClass;

// p.466 얕은 복제, 깊은 복제

public class Member implements Cloneable { // 추상메소드 없이 상속 필드만. 복제할 수 있다는 표시.
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() { // 리턴 타입이 Member 클래스
		Member cloned = null;
		
		try {
			cloned = (Member) clone(); // Object 클래스에 포함된 메소드. 자기 자신을 복제. 강제 형변환 ->clone 객체는Member 클래스가 아니기 때문.
		} catch (CloneNotSupportedException e) {
			
		}
		
		return cloned; // 복제한 객체를 리턴
	
	}
	
}
