class Solution {
    public int[] decompressRLElist(int[] nums) 
    {
        int totalLength = 0;
        for (int i = 0; i < nums.length; i+=2)
        {
            totalLength += nums[i];
        }
        int[] answer = new int[totalLength];
        int j = 0;
        for (int i = 0; i < nums.length; i+=2)
        {
            int freq = nums[i];
            while (freq > 0)
            {
                freq--;
                answer[j] = nums[i+1];
                j++;
            }
            
        }
        return answer;
    }
}
