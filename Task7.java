class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] count = new int[128];
        int left = 0, max = 0;

        for (int right = 0; right < s.length(); right++) {

            count[s.charAt(right)]++;

            while (count[s.charAt(right)] > 1) {
                count[s.charAt(left)]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}