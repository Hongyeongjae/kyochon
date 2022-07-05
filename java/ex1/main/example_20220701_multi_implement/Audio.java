

public class Audio implements RemoteControl, Searchable, KimRemote, LeeRemote, ParkRemote {
	//필드
	private int volume;
	private int channel;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println(" 기기를 킵니다 ");
	}	
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println(" 기기를 끕니다 ");
	}
	//setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			// this.volume = super.MAX_VOLUME;
			//super가 안되는 이유는 인터페이스에는 실체가 없고, 값이 없기 때문에 super로 불러 올 수가 없다.
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" 볼륨을 조정합니다 " + this.volume);
	}

	public void setChannel(int url){
		if ( url <15 ) {
			this.channel = 10;
			System.out.println(this.channel+" 번 채널로 이동합니다");
		} else if ( 15 <= url && url <23) {
			this.channel = 20;
			System.out.println(this.channel+" 번 채널로 이동합니다");
		} else if ( 23 <= url && url <80) {
			this.channel = 25;
			System.out.println(this.channel+" 번 채널로 이동합니다");
		} else if ( 80 <= url && url <150) {
			this.channel = 120;
			System.out.println(this.channel+" 번 채널로 이동합니다");
		} else {
			this.channel = 120;
			System.out.println(this.channel+" 번 채널로 이동합니다");
		}
	}
	
	public void search(int url) {
		System.out.println(url + "");
	}
}
