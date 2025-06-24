public class array2D2Spiral {

    static void spiral(int matrix[][]){
        int startRow=0;
        int startCol = 0;
        int endRow =matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startCol <= endCol && startRow <= endRow){
            //top row
            for(int j =startRow;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right side
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom row
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left side
            for(int i = endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
                
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        } 

    }
    public static void main(String[] args) {
        // int matrix [][] ={  {1,2,3,4},
        //                     {5,6,7,8,},
        //                     {9,10,11,12},
        //                     {13,14,15,16}};

        int matrix [][] ={  {1,2,3},
                            {5,6,7},
                            {9,10,11},
                            {13,14,15}};

        spiral(matrix);
    }
}
