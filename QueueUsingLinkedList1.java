/*public class QueueUsingLinkedList1 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty(){
            return head == null & tail == null;
        }

        static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
            }
            else{
                tail.next  = newNode;
                tail = newNode;
            }
            
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                head = tail = null;
            }
            else{
                head = head.next;
            }
            return front;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();

        }
    }
}*/


// By java collection framewaork

import java.util.*;
class QueueUsingLinkedList1{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  //ArrayDeque
        //Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}