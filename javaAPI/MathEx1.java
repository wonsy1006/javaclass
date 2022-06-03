package javaAPI;

//p.533 Math Class

public class MathEx1 {
	
	public static void main(String[] args) {
		
		int value1 = Math.abs(-5); // 절대값
		System.out.println(value1);
		
		double dvalue1 = Math.round(2.6); // 반올림
		System.out.println("dvalue1 = " + dvalue1);
		
		double dvalue2 = Math.ceil(2.3); // 올림
		System.out.println("dvalue2 = " + dvalue2);
		
		double dvalue3 = Math.floor(2.7); // 내림
		System.out.println("dvalue3 = " + dvalue3);
		
		double dvalue4 = Math.rint(-5.3); // 가까운 정수의 실수값. .5면 작은 값.
		System.out.println("dvalue4 = " + dvalue4);
		
		int max = Math.max(10, 50); // 두 정수 중 큰 수를 구함
		System.out.println("max = " + max);
		
		int min = Math.min(10, 50); // 두 정수 중 작은 수를 구함
		System.out.println("min = " + min);
		
	}
	
}
