public class Tree8KthAncestorofANode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     static int kthAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftAnc = kthAncestor(root.left, n, k);
        int rightAnc = kthAncestor(root.right, n, k);
        if(leftAnc == -1 && rightAnc == -1){
            return -1;
        }
        int max = Math.max(leftAnc,rightAnc);
        if(max +1 == k){
            System.out.println(root.data);
        }
        return max+1;
     }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        int n = 8;
        int k = 2;
        kthAncestor(root, n , k);
    }
}
