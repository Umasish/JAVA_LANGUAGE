public class Tree2HeightOfTree {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // Height of a tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)  + 1;
    }

    //Count of nodes
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        
        int leftcount = countNode(root.left);
        int rightcount = countNode(root.right);

        return (leftcount + rightcount) + 1;
    }

    //Sum of Nodes
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int lsum = sumOfNodes(root.left);
        int rsum = sumOfNodes(root.right);
        return (lsum + rsum) + root.data;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));

        //System.out.println(countNode(root));

        System.out.println(sumOfNodes(root));
    }
}
