
class pattern{
    void holllowRec(int row,int col){
        //outer loop
        for(int i=1;i<=row;i++){
            //inner loop
            for(int j=1;j<=col;j++){
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class hollowRectangle7 {
    public static void main(String[] args) {
        pattern p = new pattern();
        p.holllowRec(4, 7);
    }
}
