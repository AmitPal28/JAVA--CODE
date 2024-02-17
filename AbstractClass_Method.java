public class AbstractClass_Method {
    public static void main(String[] args) {
     
        sbi a = new sbi();
           a.output();   
        pnb b = new pnb();
        b.output(); 
    }
            

    
}

class sbi extends AtmMachine{

    @Override
    void output() {
        System.out.println("SBI Card is working.");
    }
}
class pnb extends AtmMachine{

    @Override
    void output() {
        System.out.println("PNB Card is working.");
    }
}
abstract class AtmMachine{
    // Can't instantiate object in an abstract class
    int amount; 
    int pin;
    int otp;
    abstract void output();

}