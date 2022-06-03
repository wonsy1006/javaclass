package javaClass.javaInterface;

// 인터페이스는 다중 구현 가능

public class SmartTV implements RemoteControl, Searchable{
	
	private int volume;

	@Override
	public void search(String url) {
		System.out.println("Searching for " + url);
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on smart TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off smart TV");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("Current smart TV volume : " + this.volume);
	}
	
}
