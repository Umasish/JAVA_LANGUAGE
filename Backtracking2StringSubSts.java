public class Backtracking2StringSubSts {
    static void stringSubsets(String str,String ans,int i){
        if(i == str.length()){
            if(ans.length()==0){
                System.err.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
            
        }
        stringSubsets(str, ans+str.charAt(i), i+1);
        stringSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        stringSubsets(str,"",0);
    }
}
