import java.util.HashMap;
import java.util.Map;

class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(checkPalPer("Tact Coa"));
    }

    private static final int LOWERCASE_LETTERS_NUM = 26;

    private static boolean checkPalPer(String string) {
        string = string.toLowerCase().replaceAll("\\s", "");

        Map<Character, Integer> map = new HashMap<>(LOWERCASE_LETTERS_NUM);

        for (int i = 0; i < string.length(); i++) {
            Character c = string.charAt(i);
            if (Character.isLetter(c)) {
                map.merge(c, 1, Integer::sum); // map.merge(c,1,(oldValue,newValue)->oldValue+newValue);
            }
        }
        // Odd length strings: Can have at most 1 character an odd # of times
        // Even length strings: Can have either 0,2,4,6... number of characters.

        int oddCount= 0;

        for (Integer value : map.values()) {
            if(value %2 !=0)
                oddCount++;
            if(oddCount > 1)
                return false;            
        }
        return true;

    }

}
