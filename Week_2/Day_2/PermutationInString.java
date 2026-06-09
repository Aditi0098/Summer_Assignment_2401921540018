class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a = s1.length();
        int b = s2.length();
        if(b<a) return false;
        int map1[] = new int[26];
        int map2[] = new int[26];
        for(int i = 0;i<a;i++){
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }
        if(isSame(map1,map2)){
            return true;
        }
        for(int i = 1;i<=b-a;i++){
            map2[s2.charAt(i-1) - 'a']--;
            map2[s2.charAt(i+a-1) - 'a']++;
            if(isSame(map1,map2)){
                return true;
            }
        }
        return false;
    }
    private boolean isSame (int map1[],int map2[]){
        for(int i =0;i<26;i++){
            if(map1[i] != map2[i]) return false;
        }
        return true;
    }
}
