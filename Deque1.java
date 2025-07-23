import java.util.*;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        
        System.out.println(dq);
        dq.addLast(3);
        System.out.println(dq);
    }
}
