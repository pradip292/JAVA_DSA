class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLL {
    private Node head;
    private int size;

    public StackUsingLL() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void top() {
        if (size == 0) {
            System.out.println("The stack is empty.");
            return;
        }
        System.out.println(head.data);
    }

    public void size() {
        System.out.println(size);
    }

    public void push(int data) {
        Node nn = new Node(data);
        nn.next = head;
        head = nn;
        System.out.println(nn.data + " is pushed into the stack");
        size++;
    }

    public void pop() {
        if (size == 0) {
            System.out.println("Stack is empty, we can't pop the element");
            return;
        }
        int popData = head.data;
        head = head.next;
        size--;
        System.out.println(popData + " removed successfully");
    }

    // Corrected print method
    public void print() {
        if (isEmpty()) {
            System.out.println("Sorry, the stack is empty");
            return;
        }
        Node temp = head;  // Use a temporary pointer for traversal
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();

        // Test Case 1: Push elements into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Test Case 2: Pop elements from the stack
        stack.pop(); // Expected: 4 removed
        stack.pop(); // Expected: 3 removed
        stack.pop(); // Expected: 2 removed
        stack.pop(); // Expected: 1 removed

        // Test Case 3: Pop from an empty stack
        stack.pop();  // Expected: Stack is empty

        // Test Case 4: Push after the stack is emptied
        stack.push(100);  // Expected: 100 is pushed

        // Test Case 5: Print the stack
        stack.print();  // Expected: Stack: 100->NULL

        // Test Case 6: Check stack size
        stack.size();  // Expected: Stack size: 1

        // Test Case 7: Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Expected: false

        // Test Case 8: Peek (top) element
        stack.top();  // Expected: Top element: 100

        // Test Case 9: Pop the last element and check if the stack is empty
        stack.pop();  // Expected: 100 removed
        stack.print();  // Expected: Sorry, the stack is empty
        stack.size();  // Expected: Stack size: 0
        System.out.println("Is stack empty? " + stack.isEmpty());  // Expected: true
    }
}
