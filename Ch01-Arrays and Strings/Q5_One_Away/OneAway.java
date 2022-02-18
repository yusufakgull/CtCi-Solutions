public class OneAway {

    public static boolean oneAway(String str1, String str2) {

        if (str1.length() == str2.length()) {
            return oneChange(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return oneInsertOrDelete(str1, str2);
        } else if (str1.length() - 1 == str2.length()) {
            return oneInsertOrDelete(str2, str1);
        }
        return false;
    }

    private static boolean oneChange(String str1, String str2) {

        boolean diffFound = false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (diffFound) {
                    return false;
                }
                diffFound = true;
            }
        }
        return true;
    }

    public static boolean oneInsertOrDelete(String shortStr, String longStr) {

        boolean control = false;
        for (int i = 0, j = 0; i < shortStr.length(); j++) {
            if (shortStr.charAt(i) != longStr.charAt(j)) {
                if (control) {
                    System.out.println(shortStr.charAt(i));
                    return false;
                }
                control = true;
            } else {
                i++;
            }
        }
        return true;
    }

}

// Time Complexity: O(n + m)
// Space Complexity: O(1)