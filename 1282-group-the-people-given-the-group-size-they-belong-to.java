class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        var list = new ArrayList<List<Integer>>();
        var hash = new HashSet<Integer>();
        
        // for i groupSizes
        // if index is already in hash
            // contiue
        // if groupSizes[i] == 1
            // add the index to the list
            // continue
        // if groupSize[i] > 1
            // add to a list
            // for the rest of the group 
                // collect other index that are the same until group is full
                // continue
        for (int i = 0; i < groupSizes.length; i++)
        {
            if (hash.contains(i))
            {
                System.out.println("hash contains " + i);
                continue;
            }
            int groupSize = groupSizes[i];
            
            System.out.println("i=" + i);
            System.out.println("groupSize=" + groupSize);
            hash.add(i);
            System.out.println("added to hash " + i);
            List<Integer> group = new ArrayList<Integer>();
            group.add(i);
            
            if(groupSize > 1)
            {
                for (int j = i+1; j < groupSizes.length;j++)
                {
                    System.out.println("j="+j);
                    System.out.println("groupSizes[j]=" + groupSizes[j]);
                    if (groupSizes[i] == groupSizes[j])
                    {
                        System.out.println("added to group and hash j=" + j);
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
