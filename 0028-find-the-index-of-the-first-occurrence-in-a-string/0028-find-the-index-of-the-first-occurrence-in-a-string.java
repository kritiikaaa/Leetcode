public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int index = haystack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(solution.strStr(haystack, needle)); // Output: 0
    }
}
