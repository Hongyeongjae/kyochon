package WeekSandwich;

public class TurSandwich  extends ingredients{
    
    
    public TurSandwich(String name, String week, String bread, String butter, String egg, String salad){
       this.name = name;
       this.week = week;
       this.bread = bread;
       this.butter = butter;
       this.egg = egg;
       this.salad = salad;
    }

    
    public void tursand(){
        System.out.println("뭐먹을까? :"+this.name);
        System.out.println("언제먹을까? :"+this.week);
    }

}
