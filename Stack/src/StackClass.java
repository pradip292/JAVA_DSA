import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Test Case 1: Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after pushing elements: " + stack);

        // Test Case 2: Peek the top element of the stack
        System.out.println("Top element is: " + stack.peek());  // Expected: 50

        // Test Case 3: Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());  // Expected: 50
        System.out.println("Popped element: " + stack.pop());  // Expected: 40
        System.out.println("Stack after popping elements: " + stack);

        // Test Case 4: Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Expected: false

        // Test Case 5: Get the size of the stack
        System.out.println("Current stack size: " + stack.size());  // Expected: 3

        // Test Case 6: Search for an element in the stack
        int position = stack.search(20);
        if (position != -1) {
            System.out.println("Element 20 is found at position (from top): " + position);
        } else {
            System.out.println("Element 20 is not found in the stack.");
        }

        // Test Case 7: Empty the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Test Case 8: Check if stack is empty after popping all elements
        System.out.println("Is stack empty now? " + stack.isEmpty());  // Expected: true
    }
}
