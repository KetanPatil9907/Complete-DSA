class Solution {
    public int longestSubarray(int[] nums) {

        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            // Count zero
            if (nums[i] == 0) {
                zeroCount++;
            }

            // More than one zero -> shrink window
            while (zeroCount > 1) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Subtract 1 because we MUST delete one element
            maxLen = Math.max(maxLen, i - left);
        }

        return maxLen;
    }
}