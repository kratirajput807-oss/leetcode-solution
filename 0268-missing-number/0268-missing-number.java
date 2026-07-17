class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum=n*(n+1)/2;
        int sum_nums=0;
        for(int i=0;i<nums.length;i++){
            sum_nums +=nums[i];
        }

        return sum-sum_nums;
    }
    
}