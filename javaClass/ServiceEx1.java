package javaClass;

// 실행 시 (런타임 시) 특정 기능을 실행하도록 정보를 제공

import java.lang.reflect.Method;

public class ServiceEx1 {

	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods(); // service class 에서 만들어진 method 정보를 얻음. 단, 순서대로 가져오지는 않음.
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(PrintAnnotation.class)) {// corona라는 method에 PrintAnnotation이 적용되는지 
				PrintAnnotation print = m.getAnnotation(PrintAnnotation.class); // print에는 printAnnotation 정보가 있음
				System.out.println("*** " + m.getName() + " ***");
				for(int i = 0; i < print.number(); i++) {
					System.out.print(print.value());
				}
				System.out.println();
			}
			
			try {
				m.invoke(new Service()); // method 안의 실제 내용을 출력하는 명령어. try ... catch 요구
			} catch(Exception e) {
				System.out.println("메소드 처리 에러");
			}
			
			
		}

	}

}
