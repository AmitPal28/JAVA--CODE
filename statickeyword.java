public class statickeyword {
    public static void main(String[] args) {
        
        Movie m1 = new Movie();
        m1.name = "Fighter";
        m1.watch = 2;
         
        Movie m2 = new Movie("ChoteMiya-BadheMiya-2", 0);
         
        System.out.println(Movie.count);
        m1.show();
        m2.launch();
    }
}

class Movie{
   String name;
   int watch;
   static int count; //  static keyword is make the property of class don't need to create the object and only class access by this property 

   public Movie(){
         count++;
   }

   public Movie(String name, int watch){
    //this();
    this.name = name;
     this.watch = watch;
     
   }
   
   void show(){
     System.out.println(name+" shows "+ watch +" watched times..");
   }
   void launch(){
     System.out.println(name+ " is launching soon...");
   }
}