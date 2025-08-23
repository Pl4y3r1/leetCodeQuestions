class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int number = x;
        int reverse = 0;
        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return reverse == x;
    }
}
