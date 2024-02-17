

public class CompiletimePolymorphism {
    public static void main(String[] args) {
       
        Number obj1 = new Number( 3 ,5);
        
        obj1.summation(3, 5); // Similarity (Same object having same behaviour or method in a single class) 
        obj1.summation(2, 6, 7); // Difference (Same object having different signature or different argument )
        
    }
}

class Number{
    int num1;
    int num2;
    public Number(){
        System.out.println("Concept of compile time polymerism "); // Overloading concept through achieve this polymorphism.
    }
    public Number(int num1, int num2){ 
        this(); 
        this.num1= num1;
        this.num2= num2;
    }

    void summation(int num1, int num2){
       System.out.println("Sum of two numbers is:"+ (num1 + num2));
    }

    void summation(int num1, int num2,int num3){
        System.out.println("Sum of three numbers is:"+ (num1 + num2+ num3));
     }
}