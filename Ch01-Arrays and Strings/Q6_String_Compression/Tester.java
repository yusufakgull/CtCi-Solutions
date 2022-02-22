public class Tester {

    public static void main(String[] args) {
        System.out.println("*** Test 1.6: String Compression\n");
        test("aabcccccaaa");
        test("abcdef");
    }

    private static void test(String s1) {
        System.out.format("%s --> %s\n", s1, StringCompression.compression(s1));
    }
    
}
