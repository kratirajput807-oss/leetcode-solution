class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int a=nums[0];//48
        int b=nums[size-1];//18
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;
    }
}