package javaClass.javaInterface;

//implementing class

public class Audio implements RemoteControl{
	// field
	private int volume; // Audio's volume
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Turning on the audio");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Turning off the audio");
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
		System.out.println("Current audio volume : " + this.volume);
	}
	
	@Override // default method를 오버라이드 -> boolean 필드 생성
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Turn the audio silent");
		} else {
			System.out.println("Get audio's volume back");
		}
	}

}
