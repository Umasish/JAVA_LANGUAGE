
class array{
    void subArraySum(int arr[]){
        int cs=0;
        int ms= Integer.MIN_VALUE;
        boolean allNegative = true;
        int maxNegative= Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){

            //check for negative number
            if(arr[i]>0){
                allNegative=false;
            }else{
                maxNegative=Math.max(maxNegative,arr[i]);
            }

            cs = cs + arr[i];
            if(cs<0){
                cs = 0;
            }
            ms=Math.max(ms, cs);
        }
        if(allNegative){
            System.out.println("max sum is "+ maxNegative);

        }
        else{
            System.out.println("max sum is "+ ms);
        }
    }
    void arr(){
        //int arr [] ={-2,-3,4,-1,-2,1,5,-3};
        int arr [] ={-4,-2,-1};
        subArraySum(arr);
    }
}
public class array10SubSumKadanes {
    public static void main(String[] args) {
        array a = new array();
        a.arr();
    }
    
}
