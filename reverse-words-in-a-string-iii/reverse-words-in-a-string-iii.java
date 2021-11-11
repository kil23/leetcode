class Solution {
    public String reverseWords(String s) {
        int size = s.length();
        if(size==1) return s;
        char[] arr = s.toCharArray();
        int firstIndex, lastIndex;
        for(int i=0; i<size; i++) {
            firstIndex = i;
            while(++i<size && arr[i]!=' ');
            lastIndex = i - 1;
            
            while(firstIndex<lastIndex) {
                char temp = arr[firstIndex];
                arr[firstIndex++] = arr[lastIndex];
                arr[lastIndex--] = temp;
            }
        }
        return new String(arr);
    }
}