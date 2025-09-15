class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length -1] < 9){
            digits[digits.length -1]++;
            return digits;
        }

        int allNines = 1;

        for(int i = digits.length -1; i>= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            } else if (digits[i] < 9){
                digits[i]++;
                allNines = 0;
                return digits;
            }
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;

        for(int i = 0; i < digits.length; i++){
            newArray[i+1] = digits[i];
        }

        return newArray;
    }
}
