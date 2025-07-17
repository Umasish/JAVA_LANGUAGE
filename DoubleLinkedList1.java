public class DoubleLinkedList1 {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    //print 
    void print(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //remove first
    int removeFirst(){
        if(head==null){
            System.out.println("linked list is emoty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //add last
    void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(tail == null){
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        newNode.next = null;
        tail = newNode;
    }

    //remove last
    //remove first
    int removeLast(){
        if(tail==null){
            System.out.println("linked list is emoty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    void reverseDoubleLinkedList(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLinkedList1 dll = new DoubleLinkedList1();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        // System.out.println(size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(size);

        // dll.addLast(5);
        // dll.print();

        // dll.removeLast();
        // dll.print();

        dll.reverseDoubleLinkedList();
        dll.print();;
    }
}
