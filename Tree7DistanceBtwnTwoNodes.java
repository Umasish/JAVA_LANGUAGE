public class Tree7DistanceBtwnTwoNodes {
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

    static Node lca(Node root,int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftlca = lca(root.left,n1,n2);
        Node rightlca = lca(root.right,n1,n2);
        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }
        return root;
    }

    static int distance(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);

        int dis1 = distanceFromLca(lca, n1);
        int dis2 = distanceFromLca(lca, n2);

        return dis1+dis2;
    }
    static private int distanceFromLca(Node root , int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int lefDis = distanceFromLca(root.left, n);
        int rightDis = distanceFromLca(root.right, n);

        if(lefDis == -1 && rightDis == -1){
            return -1;
        }
        else if(lefDis == -1){
            return rightDis+1;
        }
        else{
            return lefDis+1;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4;
        int n2 = 5;
        System.out.println(distance(root, n1, n2));
    }
}
