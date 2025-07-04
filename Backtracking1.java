public class Backtracking1 {
    static void arrayBacktarck(int arr[],int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr); 
            return;
        }
        arr[i] = val;
        arrayBacktarck(arr, i+1, val+1);
        arr[i]=val-2; // backtracking step
    }

    static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr []=new int[5];
        arrayBacktarck(arr, 0, 1);
        printArr(arr); //print the final backtraing array

    }
}
