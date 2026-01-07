import java.util.*;
public class Tree11BST1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Build a BST
    static Node buildBst(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val > root.data) {
            root.right = buildBst(root.right, val);
        } else {
            root.left = buildBst(root.left, val);
        }
        return root;
    }

    // INORDER Traversal
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search for a key
    static boolean searchKey(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }
    // Delete node

    static Node deleteNode(Node root, int value) {
        if (root.data < value) {
            root.right = deleteNode(root.right, value);
        } else if (root.data > value) {
            root.left = deleteNode(root.left, value);
        } else {
            // no child
            if (root.left == null & root.right == null) {
                return null;
            }
            //single child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            //double child
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode( root.right, IS.data);
        }
        return root;

    }
    static Node inOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInrange(Node root , int p , int q){
        if(root == null){
            return;
        }
        if(root.data >= p && root.data <= q){
            printInrange(root.left, p, q);
            System.out.print(root.data+" ");
            printInrange(root.right, p, q);
        }
        else if(root.data<p){
            printInrange(root.right, p, q);
        }
        else{
            printInrange(root.left, p, q);
        }
    }
    //print path Root to leaf
    public static void printRoot2Leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.data);
        if(root.left == null && root.right == null ){
            printPath(path);
        }
        printRoot2Leaf(root.left , path);
        printRoot2Leaf(root.right , path);
        path.remove(path.size()-1);
    }
    static void printPath(ArrayList<Integer> path){
        for(int i = 0 ; i< path.size() ; i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    // check valid BST or not
    static boolean validBst(Node root , Node min , Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data <= min.data){
            return false;
        }
        else if (max != null  && root.data >= max.data){
            return false;
        }
        return validBst(root.left, min, root) && validBst(root.right, root, max);

    }

    public static void main(String[] args) {
        int[] arr = { 8,5,3,1,4,6,10,11,14 };
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = buildBst(root, arr[i]);
        }
        inorder(root);
        System.out.println();

        // if (searchKey(root, 05)) {
        //     System.out.println("found");
        // } else {
        //     System.out.println("not found");
        // }
        // System.out.println();
        // root = deleteNode(root, 6);
        // inorder(root);

        // printInrange(root, 5,12);

        // printRoot2Leaf(root , new ArrayList<>());

        //example - {1,1,1}
        if(validBst(root, null, null)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
