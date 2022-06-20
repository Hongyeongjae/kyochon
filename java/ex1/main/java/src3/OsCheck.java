package src3;

public class OsCheck {
    public static void OsCheck(int choose) {
        if (choose == 1) {
            System.out.println("앱등이 이시군요. 확인했습니다. 진행해주세요");
        } else if ( choose == 2) {
            System.out.println("삼엽충 이시군요. 확인했습니다. 진행해주세요");
        } else {
            System.out.println("값을 확인할 수 없습니다. 다시 진행해주세요");
        }
    }

    
}
