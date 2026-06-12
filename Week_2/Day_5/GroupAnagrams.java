class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs ==null || strs.length == 0)
        return new ArrayList<>();
        Map<String,List<String>> gl = new HashMap<>();
        for(String str : strs){
            String gls = getFrequencyString(str);
            if(gl.containsKey(gls)){
                gl.get(gls).add(str);
            }
            else{
                List<String> bajaj = new ArrayList<>();
                bajaj.add(str);
                gl.put(gls,bajaj);
            }
            }
            return new ArrayList<>(gl.values());
        }
        private String getFrequencyString(String str){
            int[] freq = new int[26];
            for(char c : str.toCharArray()){
                freq[c - 'a']++;
            }
            StringBuilder gls = new StringBuilder("");
            char c= 'a';
            for(int i : freq){
                gls.append(c);
                gls.append(i);
                c++;
            }
            return gls.toString();
        }
    }
