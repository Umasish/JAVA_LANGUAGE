// here we calculate height as node size ...
// this question can be solved as counting edge number

public class Tree4DiameterOfTree {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }

    //Here the time complexity is O(N^2) because we call the height function for each node
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDia = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDia = leftHeight+rightHeight+1;

        return Math.max(selfDia, Math.max(leftDia,rightDia));
    }

    //Optimzed approach ... O(N)
    // we calculate the height with the same time of diameter calculation not call the height function

    static class Info{
        int ht;
        int di;

        Info(int ht, int di){
            this.ht = ht;
            this.di = di;
        }
    }
    static Info diameter1(Node root){
        if(root == null){
            return new Info(0,0) ;
        }
        Info leftInfo = diameter1(root.left);
        Info rightInfo = diameter1(root.right);

        int diameter = Math.max(Math.max(leftInfo.di,rightInfo.di) , leftInfo.ht+rightInfo.ht+1);
        int height = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(height,diameter);

    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        System.out.println(diameter1(root).di);
        
    }
}
