
class pattern{
    void floydsTraingle(int row){
        //outer loop
        int num = 1;
        for(int i=1;i<=row;i++){
            //inner loop for space
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

public class floydsTraingle10 {
    public static void main(String[] args) {
        pattern p = new pattern();
        p.floydsTraingle(5);
    }
    
}
