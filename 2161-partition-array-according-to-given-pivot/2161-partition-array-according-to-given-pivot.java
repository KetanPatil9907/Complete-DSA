import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        // Divide elements into three groups
        for (int num : nums) {

            if (num < pivot) {
                smaller.add(num);
            }
            else if (num == pivot) {
                equal.add(num);
            }
            else {
                greater.add(num);
            }
        }

        // Copy all elements back into the answer array
        int[] ans = new int[nums.length];
        int index = 0;

        for (int num : smaller) {
            ans[index++] = num;
        }

        for (int num : equal) {
            ans[index++] = num;
        }

        for (int num : greater) {
            ans[index++] = num;
        }

        return ans;
    }
}