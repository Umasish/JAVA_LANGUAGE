class array2{
    void pairs(int arr[]){ 
        for(int i= 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr+","+ arr[j]+")");
            }
            System.out.println();
        }
    }
    void arr(){
        int arr[] = {2,4,6,8};
        pairs(arr);

    }
}
public class array6Pairs {
    public static void main(String[] args) {
        array2 a =new array2();
        a.arr();
    }
}
