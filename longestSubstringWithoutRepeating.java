class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<String, Boolean> charMap = new HashMap<>();
        int currentLongestString = 1;
        String substring = "";

        int i = 0;

        for (i = 0; i < s.length(); i++){
            for (int j = i; j < s.length(); j++){
                if(charMap.get(String.valueOf(s.charAt(j))) != null){
                    if(currentLongestString < substring.length()){
                        currentLongestString = substring.length();
                    }
                    charMap.clear();
                    substring = "";
                    break;
                } else{
                    charMap.put(String.valueOf(s.charAt(j)), true);
                    if(substring.equals("")){
                        substring = String.valueOf(s.charAt(j));
                    } else {
                        substring = substring + String.valueOf(s.charAt(j));
                    }
                }
            }
        }

        if(substring == "" && i < 1){
            currentLongestString = 0;
        }
        return currentLongestString;
    }
}
