public class string1Palindrome {
    static boolean palindrome(String name){
        int n=name.length();
        for(int i=0;i<n/2;i++){
            if(name.charAt(i) != name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "noon";
        System.out.println(palindrome(name));
        
    }
}
