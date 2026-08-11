class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // position to place next non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!= val) {
                nums[k] = nums[i]; // push it to the front
                k++; // increase size of valid part
            }
        }
        return k;
    }
}