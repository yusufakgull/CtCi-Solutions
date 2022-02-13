import java.util.Arrays;

public class CheckPermutation {

    public static void main(String[] args) {
        String str1 = "somestring";
        String str2 = "stringsome";
        System.out.println(isPermutation(str1,str2));
    }

     /*Alternative 1 */
    public static boolean isPermutation(String str1,String str2) {
        if(str1.length() != str2.length())
            return false;
        return strSort(str1).equals(strSort(str2));   
    }

    public static String strSort(String str1) {
        char [] chars = str1.toCharArray();
        Arrays.sort(chars);
        return new String (chars);
    }

}

//  Time Complexity: O(nlogn)