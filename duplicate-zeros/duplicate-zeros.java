class Solution {
    public void duplicateZeros(int[] arr) {
        
        int size = arr.length;
        
        for(int i=size-1; i>=0; i--) {
            if(arr[i]==0) {
                for(int j=size-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }
        
    }
}