class Solution {
    public boolean hasMatch(String s, String p) {
        int mid = p.indexOf("*");
        String first = p.substring(0,mid);
        String second = p.substring(mid+1);

        int f = s.indexOf(first);
        if(f==-1) return false;

        String newstr = s.substring((f+first.length()));

        int sn = newstr.indexOf(second);
        if(sn==-1) return false;

        return true;


    }
}
