class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        // points[i] = xi yi point
        // queries[j] = xj yj rj circle
        int[] answer = new int[queries.length];
        for (int i = 0; i < points.length;i++)
        {
            int[] point = points[i];
            int pointX = point[0];
            int pointY = point[1];
            for (int j = 0; j < queries.length; j++)
            {
                int[] circle = queries[j];
                int centreCircleX = circle[0];
                int centreCircleY = circle[1];
                int r = circle[2];
                
                double d = (r*r) - (Math.pow(centreCircleX-pointX,2) + Math.pow(centreCircleY-pointY,2));
                
                if(d > 0 || d==0)
                {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}
