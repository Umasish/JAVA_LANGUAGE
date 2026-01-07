public class Tree12MirrorOfBst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =  data;
        }
    }
    static Node mirrorBST(Node root){
        if(root == null){
            return null;
        }

        Node leftSubtreeMirror = mirrorBST(root.left);
        Node rightSubtreeMirror = mirrorBST(root.right);

        root.left = rightSubtreeMirror;
        root.right = leftSubtreeMirror;

        return root;
    }
    static void preoder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data +" ");
        preoder(root.left);
        preoder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root =  mirrorBST(root);
        preoder(root);
    }

}
