class Solution {
    public int maximumWealth(final int[][] accounts) {
        int maxWealth = accounts[0][0];
        for (int i = 0; i < accounts.length; i++)
        {
            for (int j = 0; j < accounts[i].length; j++)
            {
                if (j > 0)
                {
                    accounts[i][0] += accounts[i][j];
                }
                if(accounts[i][0] > maxWealth)
                {
                    maxWealth = accounts[i][0];
                }
            }
        }
        return maxWealth;
    }
}
