class array{
    void arr(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]= marks[i]+1;
        }
    }
    void arr1(){
        int marks[]={96,97,98};
        arr(marks);

        for(int i=0;i<marks.length;i++){
            System.err.print(marks[i] + " ");
        }
    }
    
}

public class array1{
    public static void main(String[] args) {
        array a = new array();
        a.arr1();
    }
}