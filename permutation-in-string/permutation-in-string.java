class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.isEmpty() || s1.length()>s2.length()) return false;
        int size1 = s1.length(), size2 = s2.length();
        int[] text = new int[26];
        int[] pattern = new int[26];
        for(int i=0; i<size1; i++) {
            pattern[s1.charAt(i)-'a']++;
            text[s2.charAt(i)-'a']++;
        }
        
        for(int i=size1; i<size2; i++) {
            if (Arrays.equals(text, pattern)) return true;
            text[s2.charAt(i)-'a']++;
            text[s2.charAt(i-size1)-'a']--;
        }
        
        return Arrays.equals(text,pattern);
    }
}