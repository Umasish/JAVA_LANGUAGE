public class LinkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    boolean isCycle(){
        Node slow = head;
        Node first = head;
        while(first != null && first.next != null){
            slow = slow.next;
            first = first.next.next;
            if(slow == first){
                return true;
            }
        }
        return false;
    }
 
    void removeCycle(){
        Node slow =head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow= head;
        Node prev = null;
        while(slow!=fast){
            prev = fast; //last node
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;  //1->2->3->2
        System.out.println(ll.isCycle());
        ll.removeCycle();
        System.out.println(ll.isCycle());

    }
}
