class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));

        String[] str = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        for(String i:str)
        {
            if(!set.contains(i))
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
