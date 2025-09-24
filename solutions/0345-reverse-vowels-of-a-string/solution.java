class Solution {
    public String reverseVowels(String s) {
      StringBuilder sb = new StringBuilder(s);
      int i=0;
      int j=s.length()-1;

      while(i<j)
      {
        while(i<j && !isvowel(sb.charAt(i)))
        {
            i++;
        }
        while(i<j && !isvowel(sb.charAt(j)))
        {
            j--;
        }
        if(i<j)
        {
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
      }
    return sb.toString();

    }
     private boolean isvowel(char s)
      {
            char s1 = Character.toLowerCase(s);
            return(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u');
      }
}
