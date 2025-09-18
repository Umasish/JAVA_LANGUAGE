import java.util.*;
class array4{
    int binary(){
        //int arr[]={4,6,3,9,8,7};
        Scanner sc=new Scanner(System.in);
        System.out.println("HOW MUCH NUMBER YOU WANT TO STORE IN YOUR ARRAY:");
        int num=sc.nextInt();
        int arr[]= new int [num];
        System.out.println("enter your array element in sorted format ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("your array is ");
        for(int num1 : arr){
            System.out.print(num1+ " ");
        }
        System.out.println();
        int start= 0,end = arr.length-1;
        System.out.println("Enter the element you want to find:");
        int key = sc.nextInt();
        while(start<=end){
            int mid =(start+end)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(key > arr[mid]){
                start =  mid+1;
            }
            if(key == arr[mid]){
                end = mid-1;
            }
        }
        return-1;

    }
}

public class array4binarySearch {
    public static void main(String[] args) {
        array4 a= new array4();
    int result = a.binary();
    if(result==-1){
        System.out.println("element not found");
    }else{
        System.out.println("element found at index "+ result);
    }
    }
}
