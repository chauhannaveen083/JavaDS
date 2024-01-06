import java.util.*;

public class data structure Stack {
    public static void main(String[] args) {
        
        // Stack declaration and creation
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        stack.push(1); // 1 added
        stack.push(2); // 2 added
        stack.push(3); // 3 added
        System.out.println(stack.peek()); // Top data verification : 3
        
        stack.push(4); // 4 added
        stack.push(5); // 5 added
        System.out.println(stack.peek()); // Top data verification : 5

        System.out.println(stack.pop()); // Top data verification and removal :5
        System.out.println(stack.peek()); // Top data verification : 4
        
        // Removes all data in the Stack and print
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}