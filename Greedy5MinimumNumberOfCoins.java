import java.util.*;

public class Greedy5MinimumNumberOfCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,5,10,20,50,100,200,500};
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    amount-=coins[i];
                    ans.add(coins[i]);
                }
            }
        }
        System.out.println("number of note is = "+countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
