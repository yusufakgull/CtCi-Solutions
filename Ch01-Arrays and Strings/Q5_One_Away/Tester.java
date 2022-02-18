public class Tester {

    public static void main(String[] args) {
        System.out.println("*** Test 1.5: One Away\n");
        test("pale", "ple");
        test("pales", "pale");
        test("pale", "bale");
        test("pale", "bake");
    }

    private static void test(String s1, String s2) {
        System.out.format("%s, %s --> %s\n", s1, s2, OneAway.oneAway(s1, s2));
    }
    
}
