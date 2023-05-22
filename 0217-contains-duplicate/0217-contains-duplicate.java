class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        boolean bool=false;

        for (int value : countMap.values()) {
            if (value >1 ) {
                    bool=true;
                if(bool)
                {
                    break;
                }
            }
        }
        return bool;
    }
}