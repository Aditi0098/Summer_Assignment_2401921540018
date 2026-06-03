class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double a = nums.length;
        if(a<k){
            return -1;
        }
        double maxSum =0;
        double ws = 0;
        for(int i =0;i<k;i++){
            ws += nums[i];
        }
        maxSum = ws;
        for(int i =k;i< nums.length;i++){
            ws += nums[i];
            ws -= nums[i-k];
            maxSum = Math.max(ws , maxSum);
        }
        return maxSum/k;
    }
}
