public class LinkedList4MergeSort {
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
    public static int size;

    public  void addFirst(int data){
        //craete new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;//link with next node
        head=newNode;
    }
    public void prinTlinkedlist(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head ;
        }
        Node midNode = getMid(head);
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newleft = mergeSort(head);
        Node newright =  mergeSort(rightHead);
        return merge(newleft,newright);
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            while(head1!=null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            while(head2 != null){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

        }
        return mergedll.next;

    }
    public static void main(String[] args) {
        LinkedList4MergeSort ll= new LinkedList4MergeSort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.prinTlinkedlist();
        ll.head = ll.mergeSort(head);
        ll.prinTlinkedlist();


    }
}
