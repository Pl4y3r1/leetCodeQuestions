    public int lengthOfLastWord(String s) {
        int index = 0;
        int spaceFlag = 0;
        int adjust = 1;
        
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == ' ' && spaceFlag == 1){
                index = i+adjust;
                break;
            } else if(s.charAt(i) != ' '){
                spaceFlag = 1;
            } else if(s.charAt(i) == ' '){
                adjust++;
            }
        }

        if(index == 0 && adjust > 1){
            index += adjust-1;
        }

        return s.substring(index).length();
    }
}
