package javaClass;

// Annotation 적용 클래스

public class Service {
	// method
	
	@PrintAnnotation // corona 라는 메소드에 printannotation 적용
	public void corona() {
		System.out.println("Exterminate covid-19!!");
	}
	
	@PrintAnnotation("*") // *을 string의 value 값으로
	public void  corona2() {
		System.out.println("Exterminate Omicron!!");
	}
	
	@PrintAnnotation(value= "$", number = 30) // value는 $, number는 30 적
	public void corona3() {
		System.out.println("Exterminate mutated covid-19!!");
	}
}
