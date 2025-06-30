public class Recurion6tilingProblem {
    static int tiling(int n){// floor length 2 x n;
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int fnm1 = tiling(n-1);
        //horizontal
        int fnm2 = tiling(n-2);

        return fnm1+fnm2;
 
    }
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
