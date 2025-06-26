public class array2D3 {
    static void assignment1(){
        int[][] arr = { {4,7,8},{8,8,7} };
        int key =7;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        array2D3 a = new array2D3();
        a.assignment1();
    }
}
