class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int a= s.length();
        for(int i =a/2;i>=1;i--){
            if(a%i ==0){
                String gl = s.substring(0,i);
                StringBuilder bajaj = new StringBuilder();
                for(int j =1;j<=a/i;j++)
                bajaj.append(gl);
                if(bajaj.toString().equals(s))
                return true;
            }
        }
        return false;
    }
}
