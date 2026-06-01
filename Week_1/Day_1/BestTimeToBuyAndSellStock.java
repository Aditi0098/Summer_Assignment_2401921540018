class Solution {

    public int mp(int[] prices) {

        int mp = 0;

        for (int i = 0; i < prices.length; i++) {

            for (int j = i + 1; j < prices.length; j++) {

                int profit = prices[j] - prices[i];

                if (profit > mp) {
                    mp = profit;
                }
            }
        }

        return mp;
    }
}

