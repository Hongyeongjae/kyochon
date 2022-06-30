package WeekSandwich;

public class FriSandwich  extends ingredients{
    
    
    public FriSandwich(String name, String week, String bread, String butter, String abocado, String egg){
       this.name = name;
       this.week = week;
       this.bread = bread;
       this.butter = butter;
       this.abocado = abocado;
       this.egg = egg;
    }

    
    public void frisand(){
        System.out.println("뭐먹을까? :"+this.name);
        System.out.println("언제먹을까? :"+this.week);
    }

}
