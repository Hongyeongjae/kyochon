package slimeLand;
import java.util.*;
import slimeLand.bag.*;

public class Item {

    
    public String ItemName;
    public int Itemumber;
    public int ItemEffect;
    Scanner sc = new Scanner(System.in);
    String[] item = new String[5];


    public String redpotion() {
        this.ItemName = "레드 포션";
        this.Itemumber = 1;
        Warrior.hp+=50;
        System.out.println("HP "+50+" 이 회복되었습니다");
        return "블루 포션";
    }
    public String bluepotion() {
        this.ItemName = "블루 포션";
        this.Itemumber = 2;
        Warrior.mp+=50;
        System.out.println("MP "+50+" 이 회복되었습니다");
        return "블루 포션";
    }
    public String powerpotion() {
        this.ItemName = "파워 포션";
        this.Itemumber = 3;
        Warrior.hp+=100;
        System.out.println("HP "+100+" 이 회복되었습니다");
        return "파워 포션";
    }
    public String fullpotion() {
        this.ItemName = "풀 포션";
        this.Itemumber = 4;
        Warrior.hp+=300;
        System.out.println("HP "+300+" 이 회복되었습니다");
        return "풀 포션";
    }


    // public void item() {
    //     item[0] = ItemName;
    //     item[1] = ItemName;
    //     item[2] = ItemName;
    //     item[3] = ItemName;
    // }
}
