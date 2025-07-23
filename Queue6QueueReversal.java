import java.util.*;
public class Queue6QueueReversal {
    static void revereseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        for(int i = 0;i<n;i++){
            s.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
            
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        revereseQueue(q);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        
    }
}
