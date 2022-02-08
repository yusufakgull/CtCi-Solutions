
public class IsUnique {

    public static void main(String[] args) {
        String temp = "some string";
        System.out.println(isUnique(temp));
    }

    public static boolean isUnique(String str) {
        //for standart ascii table
        if (str.length() > 128)
            return false;
        boolean[] control = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            if (control[index])
                return false;
            control[index] = true;
        }
        return true;
    }

}