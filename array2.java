class findIndex{
    int find(){
        int arr[] = {2,4,5,7,8,9} ;
        int key =7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
           
        }
        return -1;
        
    }
}

public class array2 {
    public static void main(String[] args) {
        findIndex f = new findIndex();
        int result=f.find();
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
