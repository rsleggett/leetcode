class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        var list = new ArrayList<List<Integer>>();
        var hash = new HashSet<Integer>();
        
        for (int i = 0; i < groupSizes.length; i++)
        {
            if (hash.contains(i))
            {
                continue;
            }
            
            int groupSize = groupSizes[i];
            
            hash.add(i);
            List<Integer> group = new ArrayList<Integer>();
            group.add(i);
            
            if(groupSize > 1)
            {
                for (int j = i+1; j < groupSizes.length;j++)
                {
                    if (groupSizes[i] == groupSizes[j])
                    {
                        group.add(j);
                        hash.add(j);

                        if (group.size() + 1 > groupSizes[j])
                        {
                            break;
                        }
                    }
                }
            }

            list.add(group);
        }
        return list;
    }
}
