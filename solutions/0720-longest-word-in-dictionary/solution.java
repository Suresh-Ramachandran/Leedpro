class Solution {
    public String longestWord(String[] words) {

        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        String result = "";

        for(String i:words)
        {
            if(i.length()==1 || set.contains(i.substring(0,i.length()-1)))
            {
                set.add(i);
            
            if(i.length()>result.length() || (i.length()==result.length() && i.compareTo(result)<0))
            {
                result = i;
            }
            }
        }

        return result;
        
    }
}
