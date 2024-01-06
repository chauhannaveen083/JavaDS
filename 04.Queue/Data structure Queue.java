import java.util.*;

public class data structure Queue {
    public static void main(String[] args) {
        
        // Queue declaration and creation
        Queue<Integer> queue = new ArrayDeque<Integer>();
        
        queue.offer(1); // 1 added
        queue.offer(2); // 2 added
        queue.offer(3); // 3 added
        System.out.println(queue.peek()); // Front data verification : 1
        
        queue.offer(4); // 4 added
        queue.offer(5); // 5 added
        System.out.println(queue.peek()); // Front data verification : 1

        System.out.println(queue.poll()); // Front data verification and removal : 1
        System.out.println(queue.peek()); // Front data verification : 2
        
        // Removes all data in the queue and print
        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}