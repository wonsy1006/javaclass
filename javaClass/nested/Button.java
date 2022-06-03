package javaClass.nested;

//p.402

public class Button {
	 // interface type field
	
	OnClickListener listener;
	
	// Polymorphism of parameter
	void setOnClickListener(OnClickListener listener) { 
		this.listener = listener;
	}
	
	// 메소드
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		// 추상 메소드
		void onClick();
	}
	
	
}
