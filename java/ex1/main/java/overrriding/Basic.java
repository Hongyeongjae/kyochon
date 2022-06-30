package overrriding;

public class Basic {

    public static final String defaultName = "주먹";
    public static final int defaultAttRange = 1;
    public static final int defaultChangeTime = 1;

    public String name = "핵주먹";
    public int AttRange = 100;
    public int ChangeTime = 100;

    public void attAction(){
        System.out.println("무기 "+this.name+"을 장착하였습니다");
    }

    public void destruction() {
        System.out.println("무기가 파괴되었습니다");
    }
    
    public void destructionBefore (String input_name, int input_attrange, int input_chagetime) {
        this.name = input_name;
        this.AttRange = input_attrange;
        this.ChangeTime = input_chagetime;
    }

}
