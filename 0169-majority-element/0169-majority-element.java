class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            if (countMap.containsKey(num)) {
               
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        int maxValue = Integer.MIN_VALUE;
        int maxKey = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }
        
        
        return maxKey;
        
    }
}