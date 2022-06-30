package WeekSandwich;

public class MonSandwich  extends ingredients{
    
    //void가 있으면 메소드로 생각
    //void 지워주기
    //생성자는 이름 통일
    public MonSandwich(String name, String week, String bread, String butter, String blueberry, String bacon){
       this.name = name;
       this.week = week;
       this.bread = bread;
       this.butter = butter;
       this.blueberry = blueberry;
       this.bacon = bacon;
    }

    
    public void monsand(){
        System.out.println("뭐먹을까? :"+this.name);
        System.out.println("언제먹을까? :"+this.week);
    }

}
