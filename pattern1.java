
class pattern{
    void patt(){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class pattern1{
    public static void main(String[] args) {
        pattern s = new pattern();
        s.patt();
    }
}
    