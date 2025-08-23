class Solution {
    public boolean isPalindrome(int x) {
        return isPalindrome(Integer.toString(x));
    }

    private boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();
        return reverse.equals(input);
    }
}
