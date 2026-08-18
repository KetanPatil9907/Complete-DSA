class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int count = 0;
        int sum = 0;

        int requiredSum = k * threshold;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= requiredSum) {
            count++;
        }

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];

            if (sum >= requiredSum) {
                count++;
            }
        }

        return count;
    }
}