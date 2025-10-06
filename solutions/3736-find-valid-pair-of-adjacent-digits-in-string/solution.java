// class Solution {
//     public String findValidPair(String s) {
//         int[] arr = new int[10];

//         for(char i : s.toCharArray())
//         {
//             arr[i-'0']++;
//         }

//         for(int i=0;i<s.length()-1;i++)
//         {
//             int a = s.charAt(i)-'0';
//             int b = s.charAt(i + 1) - '0';
//             if(arr[a]==b && a != b)
//             {
//                 return s.substring(i,i+2);
//             }
//         }
//         return "";
//     }
// }

class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0;i < s.length() - 1;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);

            if (c1 != c2 && map.get(c1) == (c1 - '0') && map.get(c2) == (c2 - '0')) {
                return "" + c1 + c2;
            }
        }
        return "";
    }
}
