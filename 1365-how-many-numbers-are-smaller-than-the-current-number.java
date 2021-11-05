class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            int current = nums[i];
            int countSmaller = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(current != nums[j] && nums[j] < current)
                {
                    countSmaller++;
                }
            }
            answer[i] = countSmaller;
        }
        return answer;
    }
}
