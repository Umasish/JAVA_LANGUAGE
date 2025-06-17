class pattern1{
    void diamond(int row){
        for(int i=1;i<=row;i++){
            //space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            //space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class diamondShape15 {
    public static void main(String[] args) {
        pattern1 p = new pattern1();
        p.diamond(4);
    }
}
