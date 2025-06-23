class sorting2{
    void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                } 
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;  
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void sort(){
        int arr[]={5,4,1,3,2};
        //int arr[]= {1,2,3};
        selectionSort(arr);
        
    }
}
public class sort2Selection {
    public static void main(String[] args) {
        sorting2 s = new sorting2();
        s.sort();
    }
}
