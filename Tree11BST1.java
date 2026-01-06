public class Tree11BST1 {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    // Build a BST
    static Node buildBst(Node root , int val){
        if(root == null ){
            root = new Node(val);
            return root;
        }
        if(val>root.data){
            root.right = buildBst(root.right, val);
        }
        else{
            root.left = buildBst(root.left, val);
        }
        return root;
    }


    //INORDER Traversal
    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // search for a key
    static boolean searchKey(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return searchKey(root.left, key);
        }
        else{
            return searchKey(root.right, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        Node root = null;
        for(int i = 0;i<arr.length;i++){
            root = buildBst( root, arr[i]);
        }
        //inorder(root);
        if(searchKey(root, 05)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
    
}
