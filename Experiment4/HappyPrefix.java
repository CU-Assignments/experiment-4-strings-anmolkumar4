package Experiment4;

class HappyPrefix {
    public String longestPrefix(String s) {
        String result = "";
        for (int i = 1; i < s.length(); i++) {
            String pref = s.substring(0, i);
            if (s.endsWith(pref)) {
                if (pref.length() > result.length()) {
                    result = pref;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HappyPrefix solution = new HappyPrefix();
        String s = "abab";
        System.out.println(solution.longestPrefix(s));

        s = "leetcode";
        System.out.println(solution.longestPrefix(s));
    }
}
