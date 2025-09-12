class Solution {
    public int strStr(String haystack, String needle) {
        int length = needle.length();

        for(int i = 0; i < haystack.length(); i++){
            if((haystack.charAt(i) == needle.charAt(0)) && i+length-1 < haystack.length()){
                System.out.println(haystack.substring(i, i+length));
                if(haystack.substring(i, i+length).equals(needle)){
                    return i;
                } 
            }
        }

        return -1;
    }
}
