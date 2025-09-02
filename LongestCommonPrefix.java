class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 1){
            return strs[0];
        }
        
        String solution = "";
        int smallest = strs[0].length();

        for(int i = 0; i < strs.length; i++){
            if(smallest > strs[i].length()){
                smallest = strs[i].length();
            }
        }

        for(int i = 0; i < smallest; i++){
            char letter = strs[0].charAt(i);
            int mismatch = 0;
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != letter){
                    mismatch = 1;
                    break;
                }
            }
            if(mismatch == 1){
                break;
            }
            solution = solution + String.valueOf(letter);
        }

        return solution;
    }
}
