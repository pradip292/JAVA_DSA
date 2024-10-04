public class DoublyLL {
    private Node head;
    private Node tail;

    // Insert the element at the first position
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    // Insert the element at the last position
    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    // Insert the element at a particular position after the element
    public void insertParti(int after, int value) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Element does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    // Find the node containing the given value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Display the list in forward and reverse order
    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " --> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse order");
        while (last != null) {
            System.out.print(last.val + " --> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int value) {
            this.val = value;
        }

        public Node(int value, Node next, Node prev) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(10); // List: 10
        list.insertFirst(5);  // List: 5 --> 10
        list.insertLast(20);  // List: 5 --> 10 --> 20
        list.insertParti(10, 15); // List: 5 --> 10 --> 15 --> 20
        list.display();  // Display forward and backward

        System.out.println("\nInserting element after 5:");
        list.insertParti(5, 8); // List: 5 --> 8 --> 10 --> 15 --> 20
        list.display();
    }
}