//import sun.awt.image.ImageWatched;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int data){
        // step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }

        //step 2 - assign next equal to head
        newNode.next = head;

        //step 3 - assign head equals to newNode
        head = newNode;
    }

    public static void addlast(int data){
        //step 1 - create new Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }

        //step 2 - tail of next to newNode
        tail.next = newNode;

        //step 3 - tail to newNode
        tail = newNode;
    }

    public static void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
        System.out.println("The size of linked list is"+size);
    }

    public static void addindex(int index, int data){
        if(index==0){
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp =head;
        int i=0;
        while(i< index-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removefirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i=0; i<size-2; i++){
            prev= prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        size -- ;
        tail = prev;
        return val;
    }

    public static int itrsearch(int key){
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key)
                return i;
            temp=temp.next;
            i++;
        }
        return -1;

    }

    public static int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    //function for finding middle node using fast - slow approach
    public Node midNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next; //+2
            slow = slow.next;      //+1
        }
        return slow;
    }

    //function for finding palindrome

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step - 1 find midNode

        Node midNode = midNode(head);

        //step - 2 reverse half list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =  next;
        }

        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;

    }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addlast(3);
        ll.addlast(4);
        // ll.add(3,6);
        ll.print();
        //  System.out.println(ll.removeFirst());
        // System.out.println(ll.removeLast());
        //  ll.printList();
        System.out.println("key found at " + ll.recsearch(4));
        System.out.println("key found at " + ll.recsearch(5));
        // System.out.println("key found at " + ll.recsearch(4));
        // ll.reverse();

        //ll.removeNthFormEnd(3);
        //ll.printList();

        if(ll.checkPalindrome()){
            System.out.println("Linked list is palindrome");
        }else {
            System.out.println("Linked list is not palindrome");
        }

    }
}
