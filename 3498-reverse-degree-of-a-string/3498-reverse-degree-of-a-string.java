class Solution {
    public int reverseDegree(String s) {
        // int freq[]=new int[26];

        // for(char ch : s.toCharArray()){
        //     freq[ch - 'a']++;
        // }

        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ans += (i+1)*(Math.abs(123 - (int)ch));
        }

        return ans;

    }
}