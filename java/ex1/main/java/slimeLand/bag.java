package slimeLand;

import java.util.*;
import slimeLand.*;

public class bag {
    public String ItemName;
    public int Items;
    String[] item = new String[5];
    Scanner sc = new Scanner(System.in);
    Item Potion = new Item();
    
    

    // public void redpotion() {
    // this.ItemName = "레드 포션";
    // this.Items = 5;
    // Warrior.hp+=50;
    // System.out.println("HP "+50+" 이 회복되었습니다");
    // }
    // public void bluepotion() {
    // this.ItemName = "블루 포션";
    // this.Items = 5;
    // Warrior.mp+=50;
    // System.out.println("MP "+50+" 이 회복되었습니다");
    // }
    // public void powerpotion() {
    // this.ItemName = "파워 포션";
    // this.Items = 2;
    // Warrior.hp+=100;
    // System.out.println("HP "+100+" 이 회복되었습니다");
    // }
    // public void fullpotion() {
    // this.ItemName = "풀 포션";
    // this.Items = 1;
    // Warrior.hp+=300;
    // System.out.println("HP "+300+" 이 회복되었습니다");
    // }

    public void item() {
        String[] item = new String[5];
        Item Potion = new Item();
        for (int i = 0; i < item.length; i++) {
            if (monster.b == "레드 포션" && item[i] == null) {
                item[i] = Potion.redpotion();
            } else if (monster.b == "블루 포션" && item[i] == null) {
                item[i] = Potion.bluepotion();
            } else if (monster.b == "파워 포션" && item[i] == null) {
                item[i] = Potion.powerpotion();
            } else if (monster.b == "풀 포션" && item[i] == null) {
                item[i] = Potion.fullpotion();
            } else {}
                
            break;

        }
    
    }

    public void printInventory() {
        
        item();
        System.out.println("-------인벤토리-------");
        System.out.println("  당신의 인벤토리에 ");
        System.out.println("---------------------");

        for (int i=0; i<item.length; i++){
            if (item[i] == null) {
            System.out.println((i+1)+" 비어있음 ");
            
            } else { 
            System.out.println((i+1)+" "+item[i]+" ");
            }
        }
        System.out.println( "(이)가 있습니다");
    }

    public void InventoryChoose(){
        item();
        System.out.println("무엇을 선택하시겠습니까?");
        int Input = sc.nextInt();

        boolean checkWhile = true;
        while(checkWhile) {
            if (Input == 1) 
            {
                // item[0];
                checkWhile = false;
            } 
            else if (Input == 2) 
            {
                // item[1];
                checkWhile = false;
            } 
            else if ( Input == 3) 
            {
                // item[2];
                checkWhile = false;
            } 
            else if ( Input == 4) 
            {
                // item[3];
                checkWhile = false;
            } 
            else if ( Input == 5) 
            {
                // item[4];
                checkWhile = false;
            } 
            else {
                System.out.println("다시 선택해 주세요");
                continue;
            }
        }
    }
    

    // switch (Input) {
    //         case 1 : 
    //             Warrior.hp+= redpotion();
    //             System.out.println("HP 50이 회복되었습니다");
    //             checkWhile = false;
    //         case 2 : 
    //             Warrior.mp+= bluepotion();
    //             System.out.println("MP 50이 회복되었습니다");
    //             checkWhile = false;
    //         case 3 : 
    //             Warrior.hp+= powerpotion();
    //             System.out.println("HP 100이 회복되었습니다");
    //             checkWhile = false;
    //         case 4 :
    //             Warrior.hp+= fullpotion();
    //             System.out.println("HP 300이 회복되었습니다");
    //             break;
    //         default : System.out.println("다시 선택해 주세요");
    //                 continue;
    //         }

// public void Heal(int input) {
//     this.Items-=input;
//     int input_hp= Warrior.hp + 50;
// }

// public void powerHeal(int input) {
//     this.Items-=input;
//     int input_hp= input_hp + 100;
// }

    }

