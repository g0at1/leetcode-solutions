class Solution {
    public int buyChoco(int[] prices, int money) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int cost = prices[i] + prices[j];

                if (cost < minCost) {
                    minCost = cost;
                }
            }
        }

        return minCost <= money ? money - minCost : money;
    }
}
