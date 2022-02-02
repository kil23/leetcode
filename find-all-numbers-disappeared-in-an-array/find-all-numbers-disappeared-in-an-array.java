class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int size = nums.length;
        int idx = -1;
        for(int i = 0; i<size; i++) {
            if(nums[i]<0) {
                idx = nums[i]*-1 - 1;
            }else {
                idx = nums[i] - 1;
            }
            
            if(nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        
        for(int i=0; i<size; i++) {
            if(nums[i]>0) {
                list.add(i+1);
            }
        }
        
        return list;
    }
}