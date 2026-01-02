
class pattern1{
    void traingle0_1(int row){
        //outer loop
        for(int i=1;i<=row;i++){
            //inner loop for space
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}

public class traingle0_1_11 {
    public static void main(String[] args) {
        pattern1 p = new pattern1();
        p.traingle0_1(5);
    }
    
}
