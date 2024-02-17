import java.util.ArrayList;
import java.util.Iterator; // Correct import statement for Iterator interface


public class LearnArrayList {

    public static void main(String[] args) {

        /* 
       String[] employeesName = new String[20];// defined the size of array is 20.

        employeesName[0] = "Tarun";
      // employeesName[1]...employeeName[18]
       employeesName[19] = "Shivam";


       // New employee
       employeesName[20] = "Rohit"; // Index out of range Error
        */
      
        ArrayList<String> employeesName =  new ArrayList<>();
        // size = n 
        //        n+n/2+1
        employeesName.add("Rohit");
        employeesName.add("Naveen");
        System.out.println("employeesName arrayList elements is: "+ employeesName);

        employeesName.remove(String.valueOf("Rohit")); //Case2 of remove: which type of arraylist and which of element are exist.
        System.out.println("After remove method employeeName arrayList is: " +employeesName);


        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        System.out.println("mylist arrayList elements is " +  mylist);

        mylist.add(41); // This will add 4 at the end of the list
        System.out.println(mylist);

        mylist.add(0,12); // Insert for a perticular place element 
        System.out.println(mylist); 


        ArrayList<Integer> newArrayList = new ArrayList<>();  // Creating a newarray list
        newArrayList.add(20);
        newArrayList.add(30);
        System.out.println("newArrayList arraylist element access by get method for a particular index is:  " +newArrayList.get(1)); // Get return the value of this Index.


        mylist.addAll(newArrayList); // This will add all the  element
        System.out.println(mylist);
 
        mylist.remove(6); // Case1 of remove: Remove the particular index of a list.
        System.out.println(mylist);

        mylist.set(1,24); // Set method is use for list to update a particular index element. 
        System.out.println(mylist);
       
        /*
         mylist.clear(); //  Cleae Method Remove the all elements or create a empty list 
         System.out.println(mylist);
         */
        
         for (int i=0; i<mylist.size(); i++) {
            System.out.println("The element is "+ mylist.get(i));
         }
        

         for (Integer j: mylist) {
            System.out.println("Foreach element is " + j);
         }
        
         Iterator<Integer> k = mylist.iterator();
         while (k.hasNext()) {
            System.out.println("iterator: " + k.next());
         }
        

    }
}