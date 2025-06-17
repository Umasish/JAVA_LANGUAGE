class findIndex{
    int find(){
        int arr[] = {2,4,5,7,8,9} ;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
        
    }
}

public class array3 {
    public static void main(String[] args) {
        findIndex f = new findIndex();
        int result=f.find();
        System.out.println("Largest number is " + result);
        
    }
}

