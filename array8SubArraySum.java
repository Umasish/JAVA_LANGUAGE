class arraySubSum{
    void subArraySum(int arr[]){ 
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i= 0;i<arr.length;i++){
            currSum=0;
            for(int j=i;j<arr.length;j++){

                    currSum+=arr[j];
                
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
            
        }
        System.out.println("max sum is " + maxSum);
    }
    void arr(){
        int arr[] = {2,4,6,8};
        subArraySum(arr);

    }
}
public class array8SubArraySum {
    public static void main(String[] args) {
        arraySubSum a =new arraySubSum();
        a.arr();
    }
}



