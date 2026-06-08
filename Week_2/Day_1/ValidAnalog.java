class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] digits = new int[26];
           for(int i =0; i<s.length();i++){
            digits[s.charAt(i) - 'a']++;
            digits[t.charAt(i) -'a']--;
           }
           for(int value : digits){
            if(value !=0){
                return false;
            }
         }
           return true;
     }
}

