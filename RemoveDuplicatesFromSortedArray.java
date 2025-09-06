class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int cur = nums[0];
        temp.add(cur);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > cur){
                cur = nums[i];
                temp.add(nums[i]);
            }
        }

        for(int i = 0; i < temp.size(); i++){
            nums[i] = temp.get(i);
        }

        return temp.size();
    }
}
