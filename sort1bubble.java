class sorting1{
    void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                
            }
            if(swap<=0){
                System.out.println("Array is already sorted");
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void sort(){
        int arr[]={5,4,1,3,2};
        //int arr[]= {1,2,3};
        bubbleSort(arr);
        
    }
}
public class sort1bubble{
    public static void main(String[] args) {
        sorting1 s = new sorting1();
        s.sort();
        
    }
}