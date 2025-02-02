package Experiment4;

class FirstOccurence {
    public int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlelength = needle.length();
        if (haylength < needlelength)
            return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccurence solution = new FirstOccurence();
        String haystack = "hello";
        String needle = "ll";
        System.out.println(solution.strStr(haystack, needle));

        haystack = "aaaaa";
        needle = "bba";
        System.out.println(solution.strStr(haystack, needle));
    }
}
