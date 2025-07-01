public class Recusion13QuickSort {
    static void printArr(int arr[]){
            for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int piIdx= partion(arr,si, ei);
        quickSort(arr, si, piIdx-1);
        quickSort(arr, piIdx+1, ei);
    }
    static int partion(int arr[],int si,int ei){
        int pivot = arr[ei]; // pivot element
        int i =si-1; //to make place for samller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                //modification occure on original array.so,no extra space require
                
            }
        }
        //for pivot
        i++;
        //swap
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
