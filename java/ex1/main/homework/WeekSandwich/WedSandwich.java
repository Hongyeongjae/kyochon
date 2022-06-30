package WeekSandwich;

public class WedSandwich  extends ingredients{
    
    
    public WedSandwich(String name, String week, String bread, String butter, String sweetpumpkin){
       this.name = name;
       this.week = week;
       this.bread = bread;
       this.butter = butter;
       this.sweetpumpkin = sweetpumpkin;
    }

    
    public void wedsand(){
        System.out.println("뭐먹을까? :"+this.name);
        System.out.println("언제먹을까? :"+this.week);
    }

}
