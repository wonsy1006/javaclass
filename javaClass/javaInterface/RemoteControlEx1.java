package javaClass.javaInterface;

public class RemoteControlEx1 {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television(); // Polymorphism
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true); // Remote control's default method
		rc.setMute(false);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.setMute(true); 
		rc.turnOff();
		RemoteControl.changeBattery();
		
	}

}
