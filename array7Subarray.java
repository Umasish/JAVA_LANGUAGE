class array{
    void subArray(int arr[]){ 
        for(int i= 0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    void arr(){
        int arr[] = {2,4,6,8};
        subArray(arr);

    }
}
public class array7Subarray {
    public static void main(String[] args) {
        array a =new array();
        a.arr();
    }
}

