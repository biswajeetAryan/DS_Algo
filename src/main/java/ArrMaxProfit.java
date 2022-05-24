import java.util.Arrays;

public class ArrMaxProfit {
    public static void main(String[] args) {
        int [] arr = {1,4,2};
        SolutionArrMaxProfit obj = new SolutionArrMaxProfit();
        System.out.println(obj.maxProfit(arr));
    }
}
class SolutionArrMaxProfit {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, sell = Integer.MIN_VALUE, profit = 0, n = prices.length;
        for (int price : prices) {
            if (price < buy)
                buy = price;
            else if (price > buy) {
                sell = price;
                profit = Math.max(profit, sell - buy);
            }
        }
        return profit;
    }
//        for (int i = 0; i < prices.length-1; i++) {
//            buy=prices[i];
//            sell=0;
//            for (int j = i+1; j < prices.length; j++) {
//                sell=Math.max(sell,prices[j]);
//            }
//            diff=sell-buy;
//            System.out.println(buy+" "+diff);
//            profit=Math.max(profit,diff);
//        }
//        return Math.max(profit, 0);
//    }
}
