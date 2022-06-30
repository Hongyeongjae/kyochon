import java.util.ArrayList;

import WeekSandwich.*;

public class main {
  
    public static void main(String[] arg){
        

        MonSandwich Monsand = new MonSandwich("블루베리베이컨샌드위치", "월" ,"빵", "버터", "블루베리", "베이컨");
        TueSandwich Tuesand = new TueSandwich("상추베이컨샌드위치", "화", "빵","버터","상추","베이컨");
        WedSandwich Wedsand = new WedSandwich("단호박샌드위치", "수", "빵", "버터", "단호박");
        TurSandwich Tursand = new TurSandwich("에그샌드위치", "목", "빵", "버터", "계란", "샐러드");
        FriSandwich Frisand = new FriSandwich("아보카도에그샌드위치", "금", "빵", "버터", "아보카도","계란");



        ArrayList<String> mondaySand = new ArrayList<String>();
        ArrayList<String> tuesdaySand = new ArrayList<String>();
        ArrayList<String> wedsdaySand = new ArrayList<String>();
        ArrayList<String> tursdaySand = new ArrayList<String>();
        ArrayList<String> fridaySand = new ArrayList<String>();
        
        mondaySand.add(Monsand.bread+","+Monsand.butter+","+Monsand.blueberry+","+Monsand.bacon);
        tuesdaySand.add(Tuesand.bread+","+Tuesand.butter+","+Tuesand.lecttue+","+Tuesand.bacon);
        wedsdaySand.add(Wedsand.bread+","+Wedsand.butter+","+Wedsand.sweetpumpkin);
        tursdaySand.add(Tursand.bread+","+Tursand.butter+","+Tursand.egg+","+Tursand.salad);
        fridaySand.add(Frisand.bread+","+Frisand.butter+","+Frisand.abocado+","+Frisand.egg);
        
        Monsand.monsand();
        System.out.println(mondaySand);

        Tuesand.tuesand();
        System.out.println(tuesdaySand);

        Wedsand.wedsand();
        System.out.println(wedsdaySand);

        Tursand.tursand();
        System.out.println(tursdaySand);

        Frisand.frisand();
        System.out.println(fridaySand);

        

        
        
    }
    
}
