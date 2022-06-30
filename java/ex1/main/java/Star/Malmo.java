package Star;

public class Malmo {
    int numX = 10;
    int numY = 7;
    int j;
    public void Malmo() {
    for(int i=0; i<=numX; i++) {
        System.out.print("\n");
        for(int j=1; j<=(i*2)+1; j++) {
            System.out.print(" ");
        
        }
        
        for(int y=0; y<=numX-i; y++) {
            System.out.print("*");
        }
        } 


        
} 
}
