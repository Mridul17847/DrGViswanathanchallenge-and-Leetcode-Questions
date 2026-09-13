class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> s = new HashSet<>();
        for (int num : nums) {
            s.add(num);
        }
        for (int val : s) {
            if (!s.contains(val - 1)) {
                int x = val;
                int cnt = 1;
                while (s.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                ans = Math.max(ans, cnt);
            }
        }
        return ans;
    }
}