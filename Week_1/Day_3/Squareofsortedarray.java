class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        int front = 0;
        int rear = nums.length -1;
        for(int j =nums.length-1;j>=0;j--){
            if(nums[front] > nums[rear]){
            result[j] = nums[front];
            front++;
        }
        else{
            result[j] = nums[rear];
            rear--;
        }
    }
    return result;
}
}
