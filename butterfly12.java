class pattern{
    void butterfly(int row){
        for(int i=1;i<=row;i++){

            //star -> i
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }

            //space -> 2*(row-i)
            for(int j =1;j<=2*(row-i);j++){
                System.out.print(" ");
            }

            //star -> i
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted of above portion

        for(int i=row;i>=1;i--){
            
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1;j<=2*(row-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class butterfly12 {
    public static void main(String[] args) {
        pattern p = new pattern();
        p.butterfly(4);
    }
}
