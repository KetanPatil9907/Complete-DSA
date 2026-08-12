import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            // Add current character
            freq2[s2.charAt(right) - 'a']++;

            // Keep window size equal to s1 length
            if (right - left + 1 > s1.length()) {
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }

            // Compare frequencies
            if (right - left + 1 == s1.length()) {
                if (Arrays.equals(freq1, freq2)) {
                    return true;
                }
            }
        }

        return false;
    }
}