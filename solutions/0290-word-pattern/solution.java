class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" "); 
        if(pattern.length() != str.length) return false;
        Map<Character,String> map = new HashMap<>();
        int i=0;
        int flag=1;
        while(i<str.length)
        {
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(str[i]))
                {
                    return false;
                }
                //map.put(pattern.charAt(i),s.charAt(i));
            }
            else
            {
                if(map.containsValue(str[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i),str[i]);
            }
            i++;
            
        }
        return true;
            
    }
}
