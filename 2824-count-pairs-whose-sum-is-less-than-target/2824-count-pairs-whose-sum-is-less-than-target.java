class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt=0;
        int i=0;
        int j=i+1;
        while(i<(nums.size()-1)){
            for(int k=j;k<nums.size();k++){
                if(nums.get(i)+nums.get(k)<target){
                    cnt++;
                }
            }
            i++;
            j++;
        }
              return cnt;
    }
}