import java.util.*;
public class Stack3 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        while(! stack1.isEmpty()){
            System.out.println(stack1.peek());
            stack1.pop();
        }
    }
}
