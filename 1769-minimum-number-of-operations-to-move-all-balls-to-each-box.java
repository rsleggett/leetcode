class Solution {
    public int[] minOperations(String boxes) {
        var answer = new int[boxes.length()];
        var indexesWithBoxes = new ArrayList<Integer>();
        for(int i = 0; i < answer.length; i++)
        {
            char box = boxes.charAt(i);
            if (box == '1')
            {
                indexesWithBoxes.add(i);
            }
        }
        
        for (int i = 0; i < answer.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < indexesWithBoxes.size(); j++)
            {
                sum += Math.abs(i - indexesWithBoxes.get(j));
            }
            answer[i] = sum;
        }

        return answer;
    }
}
