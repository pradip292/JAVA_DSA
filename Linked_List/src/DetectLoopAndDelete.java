// Java program to detect loop in a linked list
// using hashset
import java.util.HashSet;
import java.util.Set;

//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        this.data = x;
//        this.next = null;
//    }
//}

public class DetectLoopAndDelete {

    // Function that returns true if there is a loop in
    // linked list else returns false.
    static boolean detectLoop(Node head) {
        Set<Node> st = new HashSet<>();

        // loop that runs till the head is null
        while (head != null) {

            // If this node is already present
            // in hashmap it means there is a cycle
            // (Because you will be encountering the
            // node for the second time).
            if (st.contains(head))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            st.add(head);

            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
