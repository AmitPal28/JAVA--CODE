public class thiskeyword {
    public static void main(String[] args) {
        
        Student std1 = new Student("Shivam", 51 , "IT" );
        System.out.println("Student name is : "+ std1.name );
        System.out.println("Student rollno is : "+ std1.rollno );
        System.out.println("Student branch is : "+ std1.branch );
    }
}

class Student{
    String name;
    int rollno;
    String branch;

    public Student(){
       System.out.println("Default constructor call");
    }
    public Student(String name, int rollno, String branch){
        this(); // (1) this keyword is use for in this line means  previous constructor called
        this.name = name; // (2) this keyword is using for this.current class properties is assigned to parametrised arguments
        this.rollno = rollno;
        this.branch = branch;
    }
    

    
}
 
