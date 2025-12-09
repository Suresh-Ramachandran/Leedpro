class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;
        boolean check = false;

        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(arr[i] == 2*arr[j])
                {
                    check = true;
                    break;
                }
                else if(arr[j] == 2*arr[i])
                {
                    check = true;
                    break;
                }
            }
        }
        return check;
        
    }
}
