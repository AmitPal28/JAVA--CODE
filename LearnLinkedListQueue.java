import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> ticket = new LinkedList<>();
         ticket.offer(2);
         ticket.offer(3);
         ticket.offer(4);

         System.out.println("After inserting elements, ticket is: "+ticket);

         System.out.println(ticket.poll()); // Removes and returns the head of the queue.

         System.out.println("After removing first element, ticket is: "+ticket);

        System.out.println(ticket.peek()); // Retrieves, but does not remove, the head of the queue.

    }
}
