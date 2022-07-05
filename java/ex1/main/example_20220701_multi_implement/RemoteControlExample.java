

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RemoteControlExample {
	public static void main(String[] args) {
		// Audio tv = new Audio();
		
		// RemoteControl rc = tv;
		// Searchable searchable = tv;

		// RemoteControl.changeBattery();

		// tv.setVolume();

		example();


		
			
			}        
	   
			
	private static void OutoCheck() {
		Scanner scan = new Scanner(System.in);
	
			System.out.println("채널을 입력하세요.");
			System.out.println("ex) 20 30 45 70 120");
			System.out.print(">> ");
	
			String str = scan.nextLine();
			String[] Channel = str.split("\\s+");
			
			Audio kim = new Audio();
			Audio lee = new Audio();
			Audio park = new Audio();
	
			int a = 0;
			int b = 0;
			int c = 0;
	
			while(true) {

			}
	}

	private static void example() {

		RemoteControl.changeBattery();

		Audio audio_A = new Audio();
		Audio tv = new Audio();
		// Audio example = new RemoteControl();
		//인터페이스이기 때문에 불가능하다. 아버지가 자식한테 들어가는 것은 불가능

		audio_A.turnOn();
		audio_A.setVolume(30);
		audio_A.setMute(true);
		audio_A.turnOff();
		audio_A.setChannel(100);



		// System.out.println("start");
		// tv.setMute(true);

		RemoteControl rc = null;

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();

		 Searchable searchable = tv;
	}
}
