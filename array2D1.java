import java.util.*;
class creation{
    void array2d(){
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix is: ");

        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class array2D1 {
    public static void main(String[] args) {
        creation c = new creation();
        c.array2d();
    }
}
