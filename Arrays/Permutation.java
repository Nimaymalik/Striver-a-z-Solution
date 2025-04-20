package Arrays;

public class Permutation {
    public static void allpermutation(String s, String result) {
        if (s.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            String remaining = s.substring(0, i) + s.substring(i + 1);

            allpermutation(remaining, result + ch);
        }

    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Permutation are" + s + " are:");
        allpermutation(s, "");

    }
}