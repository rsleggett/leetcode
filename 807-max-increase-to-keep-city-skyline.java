class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] skyLine = getSkylineBoth(grid);
        int totalSum = 0;
        for(int i = 0; i < grid.length; i++)
        {
            int horzSkylineValue = skyLine[i];
            
            for(int j = 0; j < grid.length; j++)
            {
                int vertSkylineValue = skyLine[j+(grid.length)];
                int currentCellValue = grid[i][j];
                int increase = currentCellValue;
                //System.out.println(String.format("horzSkyline=%d",horzSkylineValue));
                //System.out.println(String.format("vertSkyline=%d",vertSkylineValue));
                //System.out.println("currentCellValue="+currentCellValue);
                int min = Math.min(horzSkylineValue, vertSkylineValue);
                //System.out.println("increase="+increase);
                totalSum += min - currentCellValue;
                //System.out.println("totalSum="+totalSum);
            }
        }
        
        return totalSum;
    }
    
    private int[] getSkylineBoth(int[][] grid) {
        int[] skyline = new int[grid.length*2];
        for (int r = 0; r < grid.length; r++)
        {
            int highestOnColumn = grid[0][r];
            int highestOnRow = grid[r][0];
            for(int c = 1; c < grid[r].length; c++)
            {
                //System.out.println("c="+c);
                if (grid[r][c] > highestOnRow)
                {
                    highestOnRow = grid[r][c];
                }
                
                if (grid[c][r] > highestOnColumn)
                {
                    highestOnColumn = grid[c][r];
                }
            }
            //System.out.println("r="+r);
            //System.out.println("skyline[r]="+highestOnRow);
            //System.out.println("skyline[r+(grid.length-1)]="+highestOnColumn);
            skyline[r] = highestOnRow;
            skyline[r+(grid.length)] = highestOnColumn;
        }
       
        return skyline;
    }
}
