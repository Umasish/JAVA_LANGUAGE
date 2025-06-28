public class Recursion1DecreasingOrder {

    static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printDec(n);
    }
}
