package javaClass.nested;

//구현 클래스

public class MessageListener implements Button.OnClickListener {

	@Override
	public void onClick() {
		System.out.println("Sending a message");
	}
	
}
