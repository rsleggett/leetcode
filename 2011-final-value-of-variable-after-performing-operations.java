class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++)
        {
            String operation = operations[i];
            if(operation.equals("--X"))
            {
                --x;
            }
            else if(operation.equals("X++"))
            {
                x++;
            }
            else if(operation.equals("++X"))
            {
                ++x;
            }
            else if(operation.equals("X--"))
            {
                x--;
            }
        }
        return x;
    }
}
