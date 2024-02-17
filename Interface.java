public class Interface implements Website{
    public static void main(String[] args) {
        
    }

    @Override
    public void internal_work() {
        System.out.println("Developer known internal functionality of website.");
    }
}


interface Website{
     void internal_work(); // By default abstact class void fn. It is purely achieve abstraction and didn't implementation any method in an interface.
}