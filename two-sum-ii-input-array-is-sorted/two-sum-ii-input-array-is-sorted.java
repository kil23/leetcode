class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++) {
            int num = target - numbers[i];
            if(map.containsKey(num)) {
                return new int[] { map.get(num), i+1};
            }
            map.put(numbers[i], i+1);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}