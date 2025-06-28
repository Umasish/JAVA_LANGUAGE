public class Recursion4SumOfNatural {
   static int recursion(int n){
        if(n==1){
            return 1;
        }
        int sum = recursion(n-1);
        int totalSum = n+sum;
        return totalSum;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(recursion(n));
    }
}
