package javaAPI.objectClass;

import java.util.HashMap;
import javaClass.Account;

public class KeyEx1 {

	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 인스턴스 객체 생성
		// Key key1 = new Key(1);
		// Key key2 = new Key(2);
		
		// 익명 객체
		hashMap.put(new Key(1), "김철수");
		hashMap.put(new Key(2), "홍길동");
		
		String value1 = hashMap.get(new Key(1)); // line 17의 익명 개체와 다른 별개의 객체이므로 값이 null
		String value2 = hashMap.get(new Key(2)); 
		System.out.println(value1);
		System.out.println(value2);
		
		System.out.println(new Key(1).hashCode());
		System.out.println(new Key(2).hashCode());
		
		/* Key key1 = new Key(50);
		Key key2 = new Key(20);
		
		if(key1.equals(key2)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		} */
		
		

	}

}
