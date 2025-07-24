import java.util.Arrays;

public class Greedy3MinimumAbsuluteDiff {
    public static void main(String[] args) {
        int a[]={4,1,8,7};
        int b[]={2,3,6,5,};
        Arrays.sort(a);
        Arrays.sort(b);

        int minAbusulte=0;
        for(int i=0;i<a.length;i++){
            minAbusulte += Math.abs(a[i]-b[i]);
        }
        System.out.println("ans is = " +minAbusulte);
    }
}
