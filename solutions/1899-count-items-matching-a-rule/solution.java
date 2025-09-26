class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum =0;
        int index = (ruleKey.equals("type")?0:(ruleKey.equals("color")?1:2));

        for(List<String> temp:items)
        {
            if(temp.get(index).equals(ruleValue))
            {
                sum += 1;
            }
        }
        return sum;
    }
}
