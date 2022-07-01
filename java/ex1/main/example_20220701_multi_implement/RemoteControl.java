package sec03.exam03_multi_implement_class;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);

	default void setMute(boolean mute) {
		if(mute) {
			System.out.println(" 음소거를 시킵니다 ");
		} else {
			System.out.println(" 음소거를 해제합니다 ");
		}
	}
	
	static void changeBattery() {
		System.out.println(" 배터리를 바꿉니다 ");
	}
}
