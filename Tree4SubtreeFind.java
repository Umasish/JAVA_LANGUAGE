class Tree4SubtreeFind{
     static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }
    
    static boolean isSubrTree(Node root, Node subRoot){

        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        // boolean lefAns = isIdentical(root.left , subRoot);
        // boolean rigAns = isIdentical(root.right , subRoot);
        // return lefAns || rigAns;

        // we dont check both the left and right side before return 
        // because if there subtree is find in left side 
        // immediately it returns true donot need to check right side similarly for right side

        return isIdentical(root.left , subRoot) || isIdentical(root.right , subRoot);
    }

    static boolean isIdentical(Node node , Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
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

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubrTree(root, subRoot));
        
    }
}