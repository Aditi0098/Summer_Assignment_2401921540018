class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] s1 = s.toCharArray();
        for(char value : s1){
            freq[value-'a']++;
        }

        for(int i = 0;i<s.length();i++){
            if(freq[s1[i]- 'a'] ==1){
               return i;
            }
        }
        return -1;
    }
}
