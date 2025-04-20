public class RemoveParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder build = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    build.append('(');
                }
                count++;

            } else {
                count--;
                if (count > 0) {
                    build.append(')');
                }
            }
        }
        return build.toString();

    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));

    }

}
