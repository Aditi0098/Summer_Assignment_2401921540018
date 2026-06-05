class Solution {
  public  boolean isAlphaNum(char ch){
        if((ch >= '0' && ch <= '9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')){
        return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
       int srt =0, end = s.length()-1;
       while(srt < end){
        if(!isAlphaNum(s.charAt(srt))){
            srt++;
            continue;
        }
        if(!isAlphaNum(s.charAt(end))){
            end--;
            continue;
        }
       if (Character.toLowerCase(s.charAt(srt)) != Character.toLowerCase(s.charAt(end))) {
            return false;
        }
        srt++;
        end--;
       }
       return true;
    }
}
