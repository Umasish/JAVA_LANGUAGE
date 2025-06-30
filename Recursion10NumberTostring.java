public class Recursion10NumberTostring {
    static void printDigits(int n){
        String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }
        int lastDigit = n%10;
        printDigits(n/10);
        System.out.print(digit[lastDigit]+" ");

    }
    public static void main(String[] args) {
        printDigits(2019);
    }
}
