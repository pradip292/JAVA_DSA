//import java.util.*;
//
//// Node class for the linked list
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class MyLinkedList {
//
//    // Method to print the linked list
//    public static void printLinkedList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    // Method to add a node at the beginning of the list
//    public static Node addFirst(Node head, int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        return newNode;
//    }
//
//    // Method to add a node at the end of the list
//    public static Node addLast(Node head, int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            return newNode;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//        temp.next = newNode;
//        return head;
//    }
//
//    // Method to add a node at a specific index
//    public static Node addAtIndex(Node head, int data, int pos) {
//        Node newNode = new Node(data);
//        if (pos == 0) {
//            newNode.next = head;
//            return newNode;
//        }
//
//        Node prev = head;
//        for (int i = 0; i < pos - 1 && prev != null; i++) {
//            prev = prev.next;
//        }
//        if (prev == null) {
//            System.out.println("Position out of bounds");
//            return head;
//        }
//        newNode.next = prev.next;
//        prev.next = newNode;
//        return head;
//    }
//
//    // Method to delete a node at a specific index
//    public static Node deleteAtIndex(Node head, int pos) {
//        if (head == null) {
//            System.out.println("Linked list is empty");
//            return null;
//        }
//        if (pos == 0) {
//            return head.next;
//        }
//
//        Node prev = head;
//        for (int i = 0; i < pos - 1 && prev.next != null; i++) {
//            prev = prev.next;
//        }
//        if (prev.next == null) {
//            System.out.println("Position out of bounds");
//            return head;
//        }
//        prev.next = prev.next.next;
//        return head;
//    }
//
//    // Method to delete the last node
//    public static Node deleteLast(Node head) {
//        if (head == null) {
//            System.out.println("Linked list is empty");
//            return null;
//        }
//        if (head.next == null) {
//            return null; // Only one node in the list
//        }
//
//        Node prev = head;
//        while (prev.next.next != null) {
//            prev = prev.next;
//        }
//        prev.next = null;
//        return head;
//    }
//
//    // Method to reverse the linked list
//    public static Node reverse(Node head) {
//        Node prev = null;
//        Node curr = head;
//        while (curr != null) {
//            Node temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//        return prev;
//    }
//
//    // Method to detect a cycle in the linked list
//    public static Node detectCycle(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                return slow; // Cycle detected
//            }
//        }
//        return null; // No cycle
//    }
//
//    // Method to find the starting point of the cycle
//    public static Node findCycleStart(Node head) {
//        Node meetingPoint = detectCycle(head);
//        if (meetingPoint == null) {
//            return null; // No cycle
//        }
//
//        Node start = head;
//        while (start != meetingPoint) {
//            start = start.next;
//            meetingPoint = meetingPoint.next;
//        }
//        return start; // Start of the cycle
//    }
//
//    // Method to find the middle node of the linked list
//    public static Node findMiddle(Node head) {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow; // Middle node
//    }
//
//    public static boolean isPalindrome(Node head) {
//        if (head == null || head.next == null) {
//            return true;
//        }
//        Node mid = findMiddle(head);
//        Node secondHalf = reverse(mid.next);
//        Node firstHalf = head;
//
//        while (secondHalf != null) {
//            if (firstHalf.data != secondHalf.data) {
//                return false;
//            }
//            firstHalf = firstHalf.next;
//            secondHalf = secondHalf.next;
//        }
//
//        return true;
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        // Create a linked list
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(40);
//        head.next.next.next = new Node(30);
//        head.next.next.next.next = new Node(20);
//        head.next.next.next.next.next = new Node(10);
//      //  head.next.next.next.next = head.next.next; // Creates a cycle starting at node with data 30
//
//        // Operations
////        head = reverse(head);           // Reverse the list
////        head = addFirst(head, 100);     // Add node at the beginning
////        head = addLast(head, 90);       // Add node at the end
////        head = addAtIndex(head, 11, 2); // Add node at index 2
////        head = deleteAtIndex(head, 0);  // Delete node at index 0
////        head = deleteLast(head);        // Delete the last node
//
//        // Print linked list
//        System.out.println(isPalindrome(head));
//        printLinkedList(head);
//
////       //  Find middle node
////        Node middle = findMiddle(head);
////        System.out.println("Middle node data: " + (middle != null ? middle.data : "List is empty"));
////
////        // Find cycle start
////        Node cycleStart = findCycleStart(head);
////        System.out.println(cycleStart != null ? "Cycle starts at node: " + cycleStart.data : "No cycle detected");
//    }
//}

import java.util.*;

// Node class for the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {

    // Method to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Method to add a node at the beginning of the list
    public static Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // Method to add a node at the end of the list
    public static Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    // Method to add a node at a specific index
    public static Node addAtIndex(Node head, int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1 && prev != null; i++) {
            prev = prev.next;
        }
        if (prev == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }

    // Method to delete a node at a specific index
    public static Node deleteAtIndex(Node head, int pos) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return null;
        }
        if (pos == 0) {
            return head.next;
        }

        Node prev = head;
        for (int i = 0; i < pos - 1 && prev.next != null; i++) {
            prev = prev.next;
        }
        if (prev.next == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        prev.next = prev.next.next;
        return head;
    }

    // Method to delete the last node
    public static Node deleteLast(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return null;
        }
        if (head.next == null) {
            return null; // Only one node in the list
        }

        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        prev.next = null;
        return head;
    }

    // Method to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // Method to detect a cycle in the linked list
    public static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow; // Cycle detected
            }
        }
        return null; // No cycle
    }

    // Method to find the starting point of the cycle
    public static Node findCycleStart(Node head) {
        Node meetingPoint = detectCycle(head);
        if (meetingPoint == null) {
            return null; // No cycle
        }

        Node start = head;
        while (start != meetingPoint) {
            start = start.next;
            meetingPoint = meetingPoint.next;
        }
        return start; // Start of the cycle
    }

    // Method to find the middle node of the linked list
    public static Node findMiddle(Node head) {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to check if the linked list is a palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMiddle(head);
        Node secondHalf = reverse(mid.next);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a non-palindrome linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(10);

        System.out.println("Original non-palindrome list:");
        printLinkedList(head);
        System.out.println("Is palindrome: " + isPalindrome(head));
        System.out.println("List after palindrome check:");
        printLinkedList(head);

//        // Test with an actual palindrome
//        Node palindromeHead = new Node(1);
//        palindromeHead.next = new Node(2);
//        palindromeHead.next.next = new Node(3);
//        palindromeHead.next.next.next = new Node(2);
//        palindromeHead.next.next.next.next = new Node(1);
//
//        System.out.println("\nPalindrome list:");
//        printLinkedList(palindromeHead);
//        System.out.println("Is palindrome: " + isPalindrome(palindromeHead));
//        System.out.println("List after palindrome check:");
//        printLinkedList(palindromeHead);
//
//        // Demonstrate other operations
//        System.out.println("\nDemonstrating other operations:");
//        head = addFirst(head, 5);
//        System.out.println("After adding 5 at the beginning:");
//        printLinkedList(head);
//
//        head = addLast(head, 60);
//        System.out.println("After adding 60 at the end:");
//        printLinkedList(head);
//
//        head = addAtIndex(head, 25, 3);
//        System.out.println("After adding 25 at index 3:");
//        printLinkedList(head);
//
//        head = deleteAtIndex(head, 2);
//        System.out.println("After deleting node at index 2:");
//        printLinkedList(head);
//
//        head = deleteLast(head);
//        System.out.println("After deleting the last node:");
//        printLinkedList(head);
//
//        Node middle = findMiddle(head);
//        System.out.println("Middle node data: " + (middle != null ? middle.data : "List is empty"));
//
//        head = reverse(head);
//        System.out.println("After reversing the list:");
//        printLinkedList(head);

        // Demonstrate cycle detection
//        Node cycleHead = new Node(1);
//        cycleHead.next = new Node(2);
//        cycleHead.next.next = new Node(3);
//        cycleHead.next.next.next = new Node(4);
//        cycleHead.next.next.next.next = cycleHead.next; // Creates a cycle
//
//        Node cycleStart = findCycleStart(cycleHead);
//        System.out.println(cycleStart != null ? "Cycle starts at node with data: " + cycleStart.data : "No cycle detected");
    }
}