class pattern{
    void solidRhombus(int row){
        for(int i=1;i<=row;i++){
            for(int j = 1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class solidRhombus13{
    public static void main(String[] args) {
        pattern p = new pattern();
        p.solidRhombus(5);
    }
}