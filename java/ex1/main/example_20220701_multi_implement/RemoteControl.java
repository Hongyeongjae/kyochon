

public interface RemoteControl {

	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	int BATTERY_COUNT = 0;
	int channel = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);


	//default 메서드 (static X 인스턴스 없이 실행 불가)
	default void setMute(boolean mute) {
		// System.out.println("output");
		if(mute) {
			System.out.println(" 음소거를 시킵니다 ");
		} else {
			System.out.println(" 음소거를 해제합니다 ");
		}
	}
	
	//정적 메서드 (인스턴스 없이 실행 가능)
	static void changeBattery() {
		System.out.println(" 배터리를 바꿉니다 ");
	}
}
