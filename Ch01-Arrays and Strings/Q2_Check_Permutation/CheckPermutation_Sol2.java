public class CheckPermutation_Sol2 {

    private static final int NUM_ASCII_CHARS = 128;

    public static void main(String[] args) {
        String str1 = "somestring";
        String str2 = "stringsome";
        System.out.println(isPermutation(str1, str2));
    }

    private static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] chars = new int[NUM_ASCII_CHARS];

        for (int i = 0; i < str1.length(); i++) {
            // System.out.println((int)str1.charAt(i));
            chars[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            chars[str2.charAt(i)]--;
            if (chars[str2.charAt(i)] < 0)
                return false;
        }
        return true;
    }

}
// Time Complexity: O(n)