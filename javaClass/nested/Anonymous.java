package javaClass.nested;

// p.407 익명 객체 생성

public class Anonymous {
	// 필드값으로 클래스를 대입
	Person pField = new Person() {
		void work() {
			System.out.println("I go to work.");
		}
		
		@Override
		void wake() {
			System.out.println("I get up at 6.");
			work(); // method 안에서 method 호출
		}
	};
	
	// 메소드
	void method1(Person person) {
		person.wake();
	}
	
	void method2() {
		
		// 로컬 변수로 객체 대입
		Person localPerson = new Person() {
			void walk() {
				System.out.println("I take a walk.");
			}
			@Override
			void wake() {
				System.out.println("I get up at 7.");
				walk();
			}
		};
		
		// 로컬 변수 사용
		localPerson.wake();
		
	}

}
