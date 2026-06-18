class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int gl = 0;
        int n = heights.length;
        for(int i =0;i<=n;i++){
            int bajaj = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && bajaj < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i - stack.peek() -1;
                }
                gl = Math.max(gl , height *width);
            }
            stack.push(i);
        }
        return gl;
    }
}
