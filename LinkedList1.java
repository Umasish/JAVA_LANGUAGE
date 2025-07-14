public class LinkedList1 {
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
    public  void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void prinTlinkedlist(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public  void addAnyWhere(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        int i =0;
        Node temp = head;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size  == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size  == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i =0;i<=size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        tail = prev;
        prev.next = null;
        size--;
        return val;

    }
    public int linearSearch(int key){ //O(n)
        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
       int idx =  helper(head.next,key);
       if(idx == -1){
        return -1;
       }

       return idx+1;
        
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    //Reverse a linkedlist
    public void reverse(){  //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Delete n^th node from last
    void deleteNthNodeFromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        
        if(n == size){
            head = head.next;
            return;
        }
        int i = 1;
        int idxToFind = size - n;
        Node prev = head;
        while(i<idxToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    //Find middle node
    Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // middle node
    }
    boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //st1 - find the middle node
        Node midNode = findMid(head);

        //st2 - reverse the 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //st3- check right and left
        while(right!=null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }
    //find zig zag
    public void zigZag(){

        //find mid
        Node slow =head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse

        Node curr = mid.next;
        mid.next =null;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node lH = head;
        Node rH = prev;
        Node lHNext;
        Node rHNext;
        while(lH !=null && rH != null){
            lHNext = lH.next;
            lH.next = rH;

            rHNext = rH.next;
            rH.next = lHNext; 

            lH = lHNext;
            rH = rHNext;
        }

    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        /*ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addAnyWhere(2, 3);
        ll.prinTlinkedlist();
        */

        //System.out.println(size);

       // ll.removeFirst();
        //ll.prinTlinkedlist();

        //ll.removeFirst();
        //ll.prinTlinkedlist();

        // System.out.println(ll.linearSearch(4));
        // System.out.println(ll.recSearch(4));

        // ll.reverse();
        // ll.prinTlinkedlist();

        // ll.deleteNthNodeFromEnd(2);
        // ll.prinTlinkedlist();

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // System.out.println(ll.checkPalindrome());

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.prinTlinkedlist();
        ll.zigZag();
        ll.prinTlinkedlist();

        
    }
}
