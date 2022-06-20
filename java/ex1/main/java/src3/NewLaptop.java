package src3;

public class NewLaptop {
   public String ComputerName = "MacBook Pro 2021";
   public String CPU;
   public int RAM;
   public int SSD;

    public NewLaptop() {
    }

    public NewLaptop(String CCPU) {
        this.CPU = CCPU;
    }

    public NewLaptop(String CCPU, int RRAM) {
        this.CPU = CCPU;
        this.RAM = RRAM;
    }

    public NewLaptop(String CCPU, int RRAM, int SSSD) {
        this.CPU = CCPU;
        this.RAM = RRAM;
        this.SSD = SSSD;
    }


}
