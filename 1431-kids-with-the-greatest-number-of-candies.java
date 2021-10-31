class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var result = new ArrayList<Boolean>();
        int greatestNumberOfCandies = 0;
        for (int i = 0; i < candies.length; i++)
        {
            int currentCandies = candies[i] + extraCandies;
            boolean isGreatest = true;
            for (int j = 0; j < candies.length; j++)
            {
                if(currentCandies < (candies[j]))
                {
                    isGreatest = false;
                    break;
                }
            }
            result.add(isGreatest);
        }
        return result;
    }
}
