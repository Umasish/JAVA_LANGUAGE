
class pattern{
    void invertedRotated(int row){
        //outer loop
        for(int i=1;i<=row;i++){
            //inner loop for space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //innner loop for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class invertedRotatedHalfPyramid8 {
    public static void main(String[] args) {
        pattern p =new pattern();
        p.invertedRotated(5);
    }
}
