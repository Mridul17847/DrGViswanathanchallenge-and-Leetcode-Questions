class Solution {
    public int solve(int[] cost , int i,int[] dp){
        if(i>=cost.length) return 0;
        if(dp[i] !=-1) return dp[i];
        int one = solve(cost,i+1,dp);
        int two = solve(cost,i+2,dp);
        return dp[i]=cost[i] + Math.min(one,two);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        for(int i = 0;i<cost.length;i++){
            dp[i] = -1;
        }
        return Math.min(solve(cost,0,dp),solve(cost,1,dp));
    }
}