class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int temp =x;
        while(temp>0){
            int digit= temp%10;
            num= (num*10)+digit;
            temp=temp/10;
        }
        if( num==x){
            return true;
        }
        else{
            return false;
        }
    }
}