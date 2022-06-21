package slimeLand;

import java.util.Scanner;

public class Warrior {

    public String name;
    public int hp;
    public int mp;
    public int getput;
    Scanner scan = new Scanner(System.in);
    
    public int att(int att) {
        
        System.out.println(this.name+"은 "+att+" 공격을 했습니다!!");
        return att;
        
        //자바 랜덤함수 사용
    }
    public int warriordmg(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name+"은 "+dmg+" 공격을 받았습니다!!");
        return dmg;
    }

    public Warrior(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public int fireball() {
        this.mp-=150;
        return 20;
    }

    public int iceball() {
        this.mp-=100;
        return 15;
    }

    public int reapcuter() {
        this.mp-=100;
        return 15;
    }

    public void info() {
        System.out.println("_________"+name+"_________");
        System.out.println("HP = "+this.hp);
        System.out.println("MP = "+this.mp);
    }

    public int Choose(int output) {
        
        boolean checkWhile = true;
        while(checkWhile) {
            
            if(output == 1) {
                System.out.println(this.name+"은 기본공격을 사용했습니다");
                return 50;
            } else if(output ==2 && this.mp>0) {
                checkWhile = false;
            } else {
                System.out.println("mp가 부족합니다. 다시 선택해주세요");
                output = scan.nextInt();
                scan.nextLine();
            }
        }
        
        
        
        System.out.println("어떤 스킬을 사용하시겠습니까?");
        System.out.println("1. 파이어볼 2. 아이스볼 3. 리프커터");
        getput = scan.nextInt();
        while(checkWhile) {
            int answer = 0;   
        if( getput == 1 && this.mp>150 ) {
            System.out.println(this.name+"은 파이어볼을 사용했습니다");
            answer = fireball();
        } else if( getput==2 && this.mp>100) {
            System.out.println(this.name+"은 아이스볼을 사용했습니다");
            answer = iceball();
        } else if( getput==3 && this.mp>100) {
            System.out.println(this.name+"은 리프커터를 사용했습니다");
            answer = reapcuter();
        } else {
            System.out.println("mp가 부족합니다. 다시 선택해주세요");
                output = scan.nextInt();
                scan.nextLine();

        }
        return answer;
    }
        return output = (int answer);

    
       
    }
        
    
}
