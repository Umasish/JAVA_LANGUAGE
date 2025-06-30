public class Recursion9BinaryStringPrint {
    static void binarystring(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binarystring(n-1, 0, str+("0"));
        if(lastPlace==0){
            binarystring(n-1, 1, str+("1"));
        }
    }
    public static void main(String[] args) {
        binarystring(3, 0,"");
    }
}
