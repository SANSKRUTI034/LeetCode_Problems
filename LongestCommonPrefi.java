class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String Cprefix = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);
            boolean correct = true;

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    correct = false;
                    break;
                }
            }

            if (correct == false) {
                break;
            }

            Cprefix = Cprefix + ch;
        }

        return Cprefix;
    }
}