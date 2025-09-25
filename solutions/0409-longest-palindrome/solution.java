class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        int sum =0;
        for(char i:s.toCharArray())
        {
            if(map.contains(i))
            {
                map.remove(i);
                sum = sum+2;
            }
            else
            {
                map.add(i);
            }
        }
        if(!(map.isEmpty()))
        {
            sum = sum+1;
        }
        return sum;
    }
}
