import java.util.LinkedList;

class LinkedList3CollectionFramework{
    public static void main(String[] args) {
        //create 
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addLast(2);
        ll.addFirst(1);
        ll.addLast(3);
        System.out.println(ll);

        //remove
        ll.removeLast();
        System.out.println(ll);
    }
}