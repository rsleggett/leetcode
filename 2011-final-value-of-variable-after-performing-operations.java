class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++)
        {
            if (operations[i].charAt(1) == '-')
            {
                x--;
            }
            else if (operations[i].charAt(1) == '+')
            {
                x++;
            }
        }
        return x;
    }
}
