public class Solution {
    public int[] GetConcatenation(int[] nums) {
        var answer = new int[nums.Length*2];
        for(int i=0;i<nums.Length;i++)
        {
            answer[i] = nums[i];
            answer[i + nums.Length] = nums[i];
        }
        return answer;
    }
}
