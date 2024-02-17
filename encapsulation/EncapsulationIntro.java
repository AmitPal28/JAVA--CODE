package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        
    
            /*
              public void increment(){
                System.out.println("Employee doesn't known about it!..");
            }  
            */

            /*
             // Default Case: After remove public keyword then Main.java shows error the method increment() from the type EncapsultionIntro is not visible.
             void increment(){
                System.out.println("Employee doesn't known about it!..");
            } 
            */
 
     
            /*
             // private means you can access things in this class only, you can't access it from outside class.
             private void increment(){
                System.out.println("Employee doesn't known about it!..");
            } 
            */ 

    Admin u1 = new Admin();
    // Attempt to set the password directly (should not work)

    //u1.password = 7549753;  //This line will cause a compilation error
    u1.setPassword(7549753); //Set the password using the public setter method
     
    System.out.println(u1.getPassword()); // Get the password using the public getter method
   }
}


class Admin {
    private String user;
    private int password;
 
    public void setPassword(int password) {
        // Check if the user is an admin before allowing password modification
        boolean isAdmin = false;
        
        if(!isAdmin) {
            System.out.println("You cannot set the password");
        } else {
            this.password = password;
        }
    }

    public String getUser(){
        return user;
    }
    
    public void setUser(String user){ 
        this.user = user;
    }
     
    public int getPassword(){
        return password;
    }
 }