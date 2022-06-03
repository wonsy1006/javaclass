package javaClass.nested;

// p. 403

public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		/* CallListener call = new CallListener();
		btn.setOnClickListener(call); */
		
		btn.setOnClickListener(new CallListener()); //  매개변수의 다형성
		btn.touch();
		
		btn.setOnClickListener(new MessageListener()); //  매개변수의 다형성
		btn.touch();

	}

}
