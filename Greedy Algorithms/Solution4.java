public class Solution4 {
    public static int maxProfit(int prices[], int n) {
        int buy = prices[0], max_profit = 0;
        for(int i = 1; i< n; i++) {
            if(buy > prices[i])
            buy = prices[i];
            else if(prices[i] - buy > max_profit)
            max_profit = prices[i] - buy;
        }
        return max_profit;
    }
    public static void main(String[] args) {
       // int prices[] = { 7, 6, 4, 3, 1};
        int prices[] = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int max_profit = maxProfit(prices, n);
        System.out.println(max_profit);
    }
}
// time comlexity : 0(n);
// Space complexity : o(1);