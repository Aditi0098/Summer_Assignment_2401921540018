class Solution {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int top = -1;
        for(char c : s.toCharArray()) {
            if(c == '(' || c =='{' || c == '['){
                arr[++top] = c;
            }
            else{
                if (top == -1) return false;

                char last = arr[top--];
                if((c == ')' && last !='(') ||
                ( c == '}' && last  !='{') ||
                 ( c == ']' && last  !='[')) {
                    return false;
                 }
            }
        }
        return top == -1;
    }
}

