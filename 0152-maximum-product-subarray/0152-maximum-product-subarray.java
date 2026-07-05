class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length ==0){
           return 0;
       }
        int max_product=nums[0];
        int min_product=nums[0];
        int result=nums[0];
        for(int i=1; i<nums.length;i++){
            if(nums[i]>=0){
                max_product= Math.max(nums[i],max_product * nums[i]);
                min_product= Math.min(nums[i],min_product*nums[i]);

            }
            else{
                int temp=max_product;
                max_product=Math.max(nums[i],min_product* nums[i]);
                min_product=Math.min(nums[i],temp*nums[i]);

            }
            result= Math.max(result,max_product);
        }
        return result;
    }
}