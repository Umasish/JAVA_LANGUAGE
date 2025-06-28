public class Recursion2IncreasingOrder{

    /*static void printInc(int num,int n){
        if(num==n){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        printInc( num+1, n);
        
    }*/ 

    //another method
    static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
        
    }

    public static void main(String[] args) {
        //printInc(1, 5);
        printInc(5);
        
    }
}