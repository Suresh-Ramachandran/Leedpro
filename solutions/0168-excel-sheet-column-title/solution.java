class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder sb = new StringBuilder();
        while(columnNumber>=1)
        {
            // int num = (columnNumber)%26;
            // columnNumber=columnNumber-1;
            char ch = (char)('A' + (--columnNumber%26));
        //    if(num ==0)
        //    {
        //     ch = 'Z';
        //    }
            sb.insert(0,ch);
            columnNumber=columnNumber/26;
        }
        return sb.toString();
    }
}
