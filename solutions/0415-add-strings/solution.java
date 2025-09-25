class Solution {
    public String addStrings(String num1, String num2) {
        int c = 0;
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        String str = "";

        while(n1>=0 || n2>=0 || c>0)
        {
            int a = (n1>=0)?num1.charAt(n1)-'0':0;
            int b = (n2>=0)?num2.charAt(n2)-'0':0;
            str = ((a+b+c)%10)+str;
            c = (a+b+c)/10;
            n1--;
            n2--;
        }
        if(c>0)
        {
            str = c+str;
        }
        return str;
    }
}
