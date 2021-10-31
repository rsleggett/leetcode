class Solution {
    public int minPartitions(String n) {
        var split = Arrays.stream(n.split("")).mapToInt(Integer::parseInt).toArray();
        var maxValue = 0;
        var current = 0;
        for (int i = 0; i < split.length; i++)
        {
            current = split[i];
            
            if (current > maxValue)
            {
                maxValue = current;
            }
            
            if (maxValue == 9)
            {
                break;
            }
        }
        return maxValue;
    }
}

/*

[3,2]

1 0
1 1
1 1

[8,2,7,3,4]
1 0 0 0 0
1 0 1 0 0
1 0 1 0 0
1 0 1 0 0
1 0 1 0 1
1 0 1 1 1
1 1 1 1 1
1 1 1 1 1

[2,7,3,4,6,2,0,9,8,3,0,7,0,9,1,8,2,3,4,6]
 1 1 1 1 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0
 1 1 1 1 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0
   1 1 1 1 0 0 1 0 0 0 0 0 0 0 0 0 0 0 0
*/ 
