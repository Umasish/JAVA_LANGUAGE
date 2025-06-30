public class Recursion11StringLength {
    // static void printstringLength(String str,int i ,int count){
    //     if(i==str.length()){
    //         System.out.println(count);
    //         return;
    //     }
    //     count++;
    //     printstringLength(str, i+1,count);
    // }

    //another method
    static int printstringLength(String str){
        if(str.length()==0){
            return 0;
        }
        return (printstringLength(str.substring(1)) + 1);
        // str.substring(1)) it remove the firt character of string each step
    }
    public static void main(String[] args) {
        //printstringLength("umasish", 0, 0);
        System.out.println(printstringLength("chottu"));
    }
}
