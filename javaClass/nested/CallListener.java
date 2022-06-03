package javaClass.nested;

// 구현 클래스

public class CallListener implements Button.OnClickListener { // 클래스.내부 인터페이스

	@Override
	public void onClick() {
		System.out.println("Making a phone call");
	}
	
}
