// Question - https://leetcode.com/problems/remove-outermost-parentheses/description/

package Strings;


public class RemoveOutermostParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        // ()()()()(())
        System.out.println(removeOutermostParanthesis(s));
    }

    static String removeOutermostParanthesis(String s) {
        StringBuilder res = new StringBuilder();
        int counter = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (counter > 0) {
                    res.append(ch);
                }
                counter += 1;
            } else {
                counter -= 1;
                if (counter > 0) {
                    res.append(ch);
                }

            }
        }
        return res.toString();
    }
}


