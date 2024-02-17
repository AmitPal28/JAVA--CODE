public class Class_object{
    public static void main(String[] args){
         
         // Create a object
         Person p1 = new Person();  // after new keyword default constructor call with no args for this object.
         
         // {Accessing class properties in a given object}
         p1.name="Amit";
         p1.age=22;
         System.out.println(p1.name + ' ' + p1.age);
        // Accessing class behaviour in a given object
         p1.speak();
         p1.skill();
    
    
    
        }
}

// Define a class
class Person {
    String name;
    int age;
   
    // Default Constructor
   public Person(){
      //System.out.println(" Constructor called..");
   }

   void speak(){
      System.out.println(name + " is spoken by hindi or english.");
   }

   void skill(){
      System.out.println(name + " is having technical knowledge.");
   }
}




