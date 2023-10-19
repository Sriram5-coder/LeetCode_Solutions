class Solution {
    public int[] leftRightDifference(int[] nums) {
        int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        for(int i=1;i<pre.length;i++){
            pre[i]=nums[i-1]+pre[i-1];
        }
        for(int i=suf.length-2;i>=0;i--){
            suf[i]=nums[i+1]+suf[i+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(pre[i]-suf[i]);
        }
        return nums;
    }
}