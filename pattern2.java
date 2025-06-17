
class pattern{
    void patt(){
        char ch ='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

public class pattern2{
    public static void main(String[] args) {
        pattern s = new pattern();
        s.patt();
    }
}
    