class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        for (int num = x; num > 0; num /= 10) {
            int rem = num % 10;
            sum = sum * 10 + rem;
       
        }
         if(sum==x){
            return true;
        }
        else
        {
            return false;
        }
    }
}