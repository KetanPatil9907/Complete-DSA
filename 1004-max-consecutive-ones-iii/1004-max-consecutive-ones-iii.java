class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            right = i;

            // If current element is 0
            if (nums[i] == 0) {
                zeroCount++;
            }

            // Shrink window if zeros > k
            while (zeroCount > k) {

                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            // Current window = left to right
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}