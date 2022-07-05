import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public interface KimRemote {
    String name = "박준석";
    int LeeRemote = 5;
    
    default void search(int url) {
		Scanner scan = new Scanner(System.in);

        System.out.println("채널을 입력하세요.");
        System.out.println("채널을 입력하세요.");
        System.out.print(">> ");

        String str = scan.nextLine();
        String[] Channel = str.split("\\s+");
        
        
        try {
            System.out.println(name + "이 채널이 바뀝니다.");

            for ( int i = 0; i < Channel.length; i++) {
        TimeUnit.SECONDS.sleep(3);
        System.out.println(name + "의 현재 채널: " + Channel[i]);
            }
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
