class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            dp[i] =-1;
        }
        return solve(nums,0,dp);
    }
    public int solve(int[] nums,int i,int[] dp){
        if(i>=nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int robe = nums[i] +  solve(nums,i+2,dp);
        int drobe = solve(nums,i+1,dp);
        return dp[i]=Math.max(robe,drobe);
    }
}