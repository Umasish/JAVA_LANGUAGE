public class Heap2HeapSort {
    public static void heapSort(int [] arr){
        //step 1 max heap
        int n = arr.length;
        for(int i = n/2 ; i>=0 ; i--){
            heapify(arr , i , n);
        }

        //step 2 push largest index into last of the arr
        for(int i = n-1 ; i>0 ;i--){
            //swap the first and last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr , 0 , i);
        }
    }
    public static void heapify(int[] arr , int i , int size){
        int maxId = i ;
        int left = 2*i +1;
        int right = 2*i + 2;

        if(left < size && arr[left] > arr[maxId]){
            maxId = left;
        }
        if(right < size && arr[right] > arr[maxId]){
            maxId = right;
        }
        
        if(maxId != i){
            int temp = arr[i];
            arr[i] = arr[maxId];
            arr[maxId] = temp;

            heapify(arr, maxId, size);
        }
    }
    public static void main(String[] args) {
        int arr [] = {3,4,1,5,2};
        heapSort(arr);
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
