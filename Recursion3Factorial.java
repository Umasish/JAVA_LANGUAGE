public class Recursion3Factorial {

    static int fcatorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fcatorial(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fcatorial(n));
    }
}
