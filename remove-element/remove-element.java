class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        
        int j=0;
        for(int i=0; i<size; i++) {
            if(val == nums[i]) {
                continue;
            }else {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }
}