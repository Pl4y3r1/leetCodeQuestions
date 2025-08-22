class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int z = 0;
        int[] temp = new int[nums1.length + nums2.length];
        double solution = 0;

        for(;i < nums1.length && j < nums2.length;){
            if(nums1[i] <= nums2[j]){
                temp[z] = nums1[i];
                i++;
                z++;
            } else {
                temp[z] = nums2[j];
                j++;
                z++;
            }
        }

        if(i < nums1.length){
            for(; i < nums1.length; i++){
                temp[z] = nums1[i];
                z++;
            }
        }

        if(j < nums2.length){
            for(; j < nums2.length; j++){
                temp[z] = nums2[j];
                z++;
            }
        }
        int mid = (int)temp.length/2;

        if(temp.length%2 == 0){
            solution = ((double)temp[mid] + (double)temp[mid-1]) / 2;
        } else{
            solution = temp[mid];
        }
        return solution;
    }
}
