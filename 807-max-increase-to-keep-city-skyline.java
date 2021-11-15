class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] northSkyline = getSkylineVertical(grid);
        int[] westSkyline = getSkyline(grid);
        
        int totalSum = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                int horzSkylineValue = westSkyline[i];
                int vertSkylineValue = northSkyline[j]; 
                int currentCellValue = grid[i][j];
                int increase = currentCellValue;
                while(currentCellValue < horzSkylineValue && currentCellValue < vertSkylineValue)
                {
                    currentCellValue++;
                }
                totalSum += currentCellValue - increase;
            }
        }
        
        return totalSum;
    }
    
    private int[] getSkyline(int[][] grid) {
        int[] skyline = new int[grid.length];
        for (int r = 0; r < grid.length; r++)
        {
            int highestOnRow = grid[r][0];
            for(int c = 1; c < grid[r].length; c++)
            {
                if (grid[r][c] > highestOnRow)
                {
                    highestOnRow = grid[r][c];
                }
            }
            skyline[r] = highestOnRow;
        }
        return skyline;
    }
    
    private int[] getSkylineVertical(int[][] grid) {
        int[] skyline = new int[grid.length];
        for (int c = 0; c < grid.length; c++)
        {
            int highestOnColumn = grid[0][c];
            for(int r = 1; r < grid[c].length; r++)
            {
                if (grid[r][c] > highestOnColumn)
                {
                    highestOnColumn = grid[r][c];
                }
            }
            skyline[c] = highestOnColumn;
        }
        return skyline;
    }
    
    private int[] reverseArray(int[] array) {
        int[] test = new int[array.length];
        for(int i=0; i<array.length;i++)
        {
            test[i] = array[(array.length-1)-i];
        }
        return test;
    }
}
