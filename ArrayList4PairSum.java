import java.util.*;

public class ArrayList4PairSum {
    static boolean sumOfPair( ArrayList<Integer>sumPair,int target){
        int lp = 0;
        int rp = sumPair.size()-1;
        while(lp<rp){
            if(sumPair.get(lp)+sumPair.get(rp)==target){
                return true;
            }
            if(sumPair.get(lp)+sumPair.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> sumPair = new ArrayList<>();
        sumPair.add(1);
        sumPair.add(2);
        sumPair.add(3);
        sumPair.add(4);
        sumPair.add(5);
        sumPair.add(6);


        System.out.println(sumOfPair(sumPair, 5));
    }
}
