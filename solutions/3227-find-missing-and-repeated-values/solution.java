class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length;
        int[] arr = new int[size*size+1];
        int[] arr1 = new int[2];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[grid[i][j]]++;
            }
        }
        for(int i=1;i<size*size+1;i++)
        {
            if(arr[i] >1)
            {
                arr1[0]=i;
            }
            if(arr[i]==0)
            {
                arr1[1] = i;
            }
        }
        return arr1;
    }
}
