class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int current_sum =nums[0];

        for(int i=1;i<nums.length;i++){
            if(current_sum<0){
                current_sum=0;
            }
            current_sum += nums[i];

        if(current_sum>sum){
            sum= current_sum;
        }
        }

        return sum;
    }
}