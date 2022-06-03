package javaClass.nested;

// external class
public class ClassA {
	// field
	int fieldA;
	static int fieldA2; 
	
	// constructor
	public ClassA() {
		System.out.println("ClassA is created.");
	}
	
	// method
	void methodA() {
		// local class 로컬 클래스 : 메소드 안에 만드는 클래스
		class ClassD {
			int fieldD;
			
			public ClassD() {
				System.out.println("ClassD, local class inside the method is created.");
			}
			
			void methodD() {
				
			}
		} // ClassD
		
		// 로컬 클래스는 메소드 안에서만 사용 가능
		ClassD dd = new ClassD();
		dd.fieldD = 60;
		dd.methodD();
		
	} // methodA
	
	// instance internal class 인스턴스 내부 클래스
	class ClassB {
		// field
		int fieldB;
		// static int filedB2; -> 인스턴스 클래스이기 때문에 정적 필드 만들 수 없음
		
		// constructor
		public ClassB() {
			System.out.println("ClassB is created.");
		}
		
		// method
		void methodB() {
			// 부모 메소드 ClassA의 필드와 메소드 사용 가능
			fieldA = 10;
			methodA();
		}
		
		// static void methodB2; -> 인스턴스 클래스이기 때문에 정적 메소드 만들 수 없음
 	}
	
	// static internal class 정적 내부 클래스
	static class ClassC {
		// field
		int fieldC;
		static int fieldC2;
		
		// constructor
		public ClassC() {
			System.out.println("ClassC is created.");
		}
		
		// method
		void methodC() {
			// fieldA = 20; -> 정적 클래스에서는 부모 클래스 필드나 메소드라도 사용 불가  
			fieldA2 = 20; // -> 부모 클래스의 정적 필드 / 메소드는 사용 가능
		}
		
		static void methodC2() {
			
		}
		
	}
	
}
