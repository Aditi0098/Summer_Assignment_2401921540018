class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] gl = new int[26];
        int[] bajaj = new int[26];
        List<Integer> result = new java.util.ArrayList<>();
        for(char value: p.toCharArray()){
            gl[value - 'a']++;
        }
        for(int i =0;i<s.length();i++){
            bajaj[s.charAt(i) - 'a']++;
            if(i>=p.length()){
            bajaj[s.charAt(i-p.length()) -'a']--;
            }
            if(Arrays.equals(bajaj,gl)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}
