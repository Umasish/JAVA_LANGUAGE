class arrayStockBuy{
    int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){//profit
                int profit= prices[i] - buyPrice;//todays profit
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
}
public class array12buyandSellStocks {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        arrayStockBuy a =new arrayStockBuy ();
        System.out.println(a.buyAndSellStocks(prices));
    }
}
