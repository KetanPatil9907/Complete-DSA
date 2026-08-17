/*class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int right = 0;

        int maxLen = 0;
        int maxFreq = 0;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            right = i;

            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(
                maxFreq,
                freq[s.charAt(right) - 'A']
            );

            while ((right - left + 1) - maxFreq > k) {

                freq[s.charAt(left) - 'A']--;

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}*/
class Solution {

    int find(int[] a) {
        int maxc = -1;

        for (int i = 0; i < 256; i++) {
            maxc = Math.max(maxc, a[i]);
        }

        return maxc;
    }

    public int characterReplacement(String s, int k) {

        int n = s.length();

        int[] f = new int[256];

        int low = 0;
        int high = 0;
        int res = Integer.MIN_VALUE;

        for (high = 0; high < n; high++) {

            f[s.charAt(high)]++;

            int maxcnt = find(f);

            int len = high - low + 1;

            int diff = len - maxcnt;

            while (diff > k) {

                f[s.charAt(low)]--;

                low++;

                maxcnt = find(f);

                len = high - low + 1;

                diff = len - maxcnt;
            }

            len = high - low + 1;

            res = Math.max(res, len);
        }

        return res;
    }
}