package javaAPI.stringClass;

public class StringEx6 {

	public static void main(String[] args) {
		String name1 = new String("홍길동");	
		String name2 = new String("홍길동");
		
		if(name1 == name2) {
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다."); // name1과 name2가 참조하는 주소가 다르기 때문에 다른 이름.
		}
		
		if(name1.equals(name2)) { // 
			System.out.println("같은 이름입니다.");
		} else {
			System.out.println("다른 이름입니다."); 
		}
	}
}
