import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        
        Stack<String> bucket = new Stack<>();

        bucket.push("Red");
        bucket.push("Blue");
        bucket.push("Pink");
        bucket.push("Skyblue");

        System.out.println("Stack of Bucket: "+ bucket);

        System.out.println("Top of the element: "+bucket.peek());

        bucket.pop();
        System.out.println("Stack of Bucket: "+ bucket);
        System.out.println("Top of the element: "+bucket.peek());


    }
}