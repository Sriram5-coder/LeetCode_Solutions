class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int output=0;
        if(nums[0]!=0){
            return 0;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                output=nums[i]+1;
            }
        }
        if(output==0){
            return nums.length;
        }else{
            return output;
        }
    }
}