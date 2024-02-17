public class MultilevelInheritance {
    
        public static void main(String[] args) {
            
            //Organization a = new Organization("Ramesh", 58);
            //Developer  b = new Developer("Akash", 24);
            Javadev c = new Javadev("Abhishek", 16);
            c.cultural();
            c.work("Backend");
           
        }
    }
    
    //Implemenatation of MultilevelInheritance 
    
    // Derived/Sub/Child-- class

    class Javadev extends  Developer{
         public Javadev(String fullName, int id){
            super(fullName,id);
         }

         void work(){
            System.out.println("In Java Springboot used for backend and their used to integrate web API");
         }
    }

    class Developer extends Organization{ 
        
        public Developer(String fullName, int id){
            super(fullName,id); // super keyword use for an inherits the parent class properities to child class.
        }
    
        void work(String profile){
            System.out.println("I'm working on software developer profile..");
        }
    }
    
    
    // Base/super/Parent-- class
    class Organization{
        String fullName;
        int id;
        
        public Organization(String fullName, int id){
            this.fullName = fullName;
            this.id = id;
        }
    
        void cultural(){
            System.out.println("Organization schedule each quarterly cultural activities.");
        }
        void work(){
            System.out.println("Organization provides us  flexible job if any problem occured in an employee.");
        }
    
    }

