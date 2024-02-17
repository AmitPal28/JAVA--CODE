public class ConstructorOverloading {

    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.wheeltype = "Steel-wheels";
        c1.color = "Silver";
        Car c2 = new Car("Chrome-wheels","Black");
        
        c1.horn();
        c2.driver();
        
    }
    
}

// OUR CLASS
class Car{
   String wheeltype;
   String color;

   public Car(){ //Defaut Constructor
       
   }
   public Car(String newWheeltype, String newColor){//Parametrised Constructor
       wheeltype= newWheeltype ;
       color= newColor;
   }

   void driver(){
      System.out.println( wheeltype+" car is driving");
    }
   void horn(){
    System.out.println( color+" Car inside horn blow ");
    }

}

