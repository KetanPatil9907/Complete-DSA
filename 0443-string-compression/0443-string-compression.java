class Solution {
    public int compress(char[] chars) {

        int index = 0; // write pointer
        int i = 0;     // start of group

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            // Count consecutive same characters
            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            // Write the character
            chars[index++] = current;

            // Write the count if greater than 1
            if (count > 1) {

                String str = String.valueOf(count);

                for (char ch : str.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }
}