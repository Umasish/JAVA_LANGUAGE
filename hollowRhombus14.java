class pattern{
    void hollowRhombus(int row){
        for(int i=1;i<=row;i++){
            //space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j=1;j<=row;j++){
                if(i==1 || i== row || j==1|| j==row){
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

public class hollowRhombus14 {
    public static void main(String[] args) {
        pattern p =new pattern();
        p.hollowRhombus(5);
    }
}
