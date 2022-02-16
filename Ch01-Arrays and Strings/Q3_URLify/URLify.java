public class URLify {

    public static void main(String[] args) {

        String str = "Mr John Smith     ";
        char[] chars = str.toCharArray();
        urLify(chars, str.trim().length());
        System.out.println(chars);

    }

    public static void urLify(char[] input, int length) {

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (input[i] == ' ')
                spaceCount++;
        }
        if (spaceCount > 0) {
            int j = length + spaceCount * 2;
            for (int i = length - 1; i >=0; i--) {
                if (input[i] != ' ') {
                    input[j - 1] = input[i];
                    j--;
                } else {
                    input[j - 1] = '0';
                    input[j - 2] = '2';
                    input[j - 3] = '%';
                    j = j - 3;
                }
            }
        }
    }
}

//  Time Complexity: O(n)
// Space Complexity: O(1)