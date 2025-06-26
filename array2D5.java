/*
 Question 3 :Write a program to FindTransposeofa Matrix.
 What is Transpose?Transpose of a matrix is the process ofswapping 
 therows to columns. For a 2x3 matrix,Matrix

 a11   a12    a13
 a21    a22    a23

 Transposed Matrix
 a11    a21
 a12    a22
 a13    a23
 */

public class array2D5 {
    static void transposed(){
        
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3},{5,6,7} };
        int row =4;
        int col = 3;
        System.out.println("your matrix is: ");
        printMatrix(nums);

        //tranpose matrix
        int tranpose[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tranpose[j][i] = nums[i][j];
            }
        }
        System.out.println("your transpose matrix is: ");
        printMatrix(tranpose);
    }
    static void printMatrix(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        array2D5 a = new array2D5();
        a.transposed();
    }
}
