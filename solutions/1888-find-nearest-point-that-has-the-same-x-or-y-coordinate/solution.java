class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int dist =Integer.MAX_VALUE;
        int index =-1;
        for(int j=0;j<points.length;j++)
        {
            int[] i = points[j];
            if(x==i[0] || y==i[1])
            {
                int temp = Math.abs(x - i[0])+Math.abs(y - i[1]);
                if(dist>temp)
                {
                    dist = temp;
                    index = j;
                }
            }
        }
        return index;
    }
}
