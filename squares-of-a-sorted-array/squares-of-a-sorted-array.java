class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] arr1 = new int[size];
        for(int i=0; i<size; i++) {
            arr1[i] = nums[i]*nums[i];
        }
        
        Arrays.sort(arr1);
        
        return arr1;
    }
}