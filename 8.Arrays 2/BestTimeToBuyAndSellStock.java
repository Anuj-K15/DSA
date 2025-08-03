public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) { // O(n^2) solution(brute force approach) )
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) { // i is the buy day
            for (int j = i + 1; j < prices.length; j++) { // j is the sell day
                if (j > i) {
                    int profit = prices[j] - prices[i];
                    if (profit > maxProfit) {
                        maxProfit = Math.max(maxProfit, profit);
                    }
                }
            }
        }
        return maxProfit;
    }

    public static int maximumProfit(int[] prices) { // O(n) solution 
        int buyPrice = Integer.MAX_VALUE;
        int maxiProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxiProfit = Math.max(maxiProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxiProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit is: " + maxProfit(prices));  // O(n^2) solution
        System.out.println("Max profit is: " + maximumProfit(prices)); // O(n) solution
    }
}
