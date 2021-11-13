class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if(size==0) return 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0, j=0; i<size; i++) {
            if(map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}