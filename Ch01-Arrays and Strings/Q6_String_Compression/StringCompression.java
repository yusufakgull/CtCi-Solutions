public class StringCompression {

    public static String compression(String str){

        StringBuilder compressed = new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
            if(str.length() <= i+1 || str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(count);
                count=0;
            }
        }
        return compressed.length()<str.length() ? compressed.toString() : str;
    }
}

//  Time Complexity: O(n)
// Space Complexity: O(n)
