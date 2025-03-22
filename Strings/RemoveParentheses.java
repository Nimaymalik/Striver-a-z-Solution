package Strings;

public class RemoveParentheses {
    public String removeOuterParentheses(String s) {

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
        RemoveParentheses remove = new RemoveParentheses();
        System.out.println(remove.removeOuterParentheses(s));

    }

}
