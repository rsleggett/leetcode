class SubrectangleQueries {
    
    private int[][] rectangle;

    public SubrectangleQueries(final int[][] rectangle) {
        this.rectangle = rectangle;
    }
    
    public void updateSubrectangle(final int row1, final int col1, final int row2, final int col2, final int newValue) {
        for (int i = row1; i <= row2; i++)
        {
            for (int j = col1; j <= col2; j++)
            {
                this.rectangle[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }
}
