package WeekSandwich;

public class TueSandwich  extends ingredients{
    
    
    public TueSandwich(String name, String week, String bread, String butter, String lecttue, String bacon){
       this.name = name;
       this.week = week;
       this.bread = bread;
       this.butter = butter;
       this.lecttue = lecttue;
       this.bacon = bacon;
    }

    
    public void tuesand(){
        System.out.println("뭐먹을까? :"+this.name);
        System.out.println("언제먹을까? :"+this.week);
    }

}
