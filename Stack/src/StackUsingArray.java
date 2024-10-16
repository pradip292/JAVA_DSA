public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;  // Indicates that the stack is empty
    }

    // Method to push an element into the stack
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + data);
            return;
        }
        stack[++top] = data;  // Increment top and add the data
        System.out.println(data + " pushed into the stack");
    }

    // Method to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No element to pop.");
            return -1;  // Returning -1 if the stack is empty
        }
        int poppedData = stack[top--];  // Pop the top element and decrement the top
        return poppedData;
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to get the current size of the stack
    public int size() {
        return top + 1;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);  // Stack with capacity 5

        // Test case 1: Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Test case 2: Try to push when stack is full
        stack.push(60);  // Expected: Stack Overflow

        // Test case 3: Peek at the top element
        System.out.println("Top element is: " + stack.peek());  // Expected: 50

        // Test case 4: Pop elements
        System.out.println("Popped element: " + stack.pop());  // Expected: 50
        System.out.println("Popped element: " + stack.pop());  // Expected: 40
        System.out.println("Popped element: " + stack.pop());  // Expected: 30

        // Test case 5: Current size of the stack
        System.out.println("Current stack size: " + stack.size());  // Expected: 2

        // Test case 6: Pop remaining elements
        stack.pop();  // Expected: 20
        stack.pop();  // Expected: 10

        // Test case 7: Try to pop from an empty stack
        System.out.println("Popped element: " + stack.pop());  // Expected: Stack Underflow

        // Test case 8: Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Expected: true
    }
}
