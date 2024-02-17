public class SingleInheritance {
    public static void main(String[] args) {
        
        Father a = new Father("Ramesh", 58);
        Child  b = new Child("Akash", 24);
        b.nature();
        a.work();
        b.work(); // prefer to own behaviour first if it present  that called runtime polymorphism.
       
    }
}

//Implemenatation of SingleInheritance 

// Derived/Sub/Child-- class
class Child extends Father{ 
    
    public Child(String fullName, int age){
        super(fullName,age); // super keyword use for an inherits the parent class properities to child class.
    }

    void work(){
        System.out.println("I'm working on software developer profile..");
    }
}


// Base/super/Parent-- class
class Father{
    String fullName;
    int age;

    public Father(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    void nature(){
        System.out.println("His very calm and patience person");
    }
    void work(){
        System.out.println("His working on central ordinance depot");
    }

}