
class pattern{
    void invertedHalfPyramid(int row){
        //outer loop
        for(int i=1;i<=row;i++){
            int num =1;
            //inner loop for space
            for(int j=1;j<=(row-i+1);j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}

public class invertedHalfPyramidNumber9 {
    public static void main(String[] args) {
        pattern p= new pattern();
        p.invertedHalfPyramid(5);
    }
}
