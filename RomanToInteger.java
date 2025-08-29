class Solution {
    public int romanToInt(String s) {
        int[] nums = new int[s.length()];
        int solution = 0;
        HashMap<String, Integer> romanMap = new HashMap<String, Integer>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        for(int i = 0; i < s.length(); i++){
            nums[i] = romanMap.get(String.valueOf(s.charAt(i)));
        }

        for(int i = 0; i < nums.length; i++){
            if(i < nums.length - 1){
                if(nums[i] == 1 && (nums[i+1] == 5 || nums[i+1] == 10)){
                    solution += nums[i+1] - nums[i];
                    i++;
                } else if (nums[i] == 10 && (nums[i+1] == 50 || nums[i+1] == 100)){
                    solution += nums[i+1] - nums[i];
                    i++;
                } else if (nums[i] == 100 && (nums[i+1] == 500 || nums[i+1] == 1000)){
                    solution += nums[i+1] - nums[i];
                    i++;
                } else {
                    solution += nums[i];
                }
            } else{
                solution += nums[i];
            }
        }

        return solution;
    }
}
