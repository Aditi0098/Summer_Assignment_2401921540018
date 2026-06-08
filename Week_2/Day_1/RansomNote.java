class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] digits = new int[26];
        for(char value : magazine.toCharArray()){
            digits[value-'a']++;
        }
        for(char value : ransomNote.toCharArray()){
            digits[value-'a']--;
            if(digits[value-'a']< 0)
            return false;
        }
        return true;
    }
}
