package javaClass.javaInterface;

// implementing class

public class Television implements RemoteControl {
	// field
	private int volume; // TV's volume
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Turning on the TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off the TV");
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
		System.out.println("Current TV volume : " + this.volume);
	}
	
	@Override // default method를 오버라이드 -> boolean 필드 생성
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Turn the TV silent");
		} else {
			System.out.println("Get TV's volume back");
		}
	}

}
