class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int effHeight = Math.min(height[i],height[j]);
            int area = effHeight*(j-i);
            max = Math.max(max,area);
            while (i < j && height[i] <= effHeight) i++;
            while (i < j && height[j] <= effHeight) j--;
        }
        return max;
    }
}