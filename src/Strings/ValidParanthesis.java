//question - https://leetcode.com/problems/valid-parentheses/description/?envType=problem-list-v2&envId=string

package Strings;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args){
        String s = "({])";
        System.out.println(validparanthesis(s));
    }
    static boolean validparanthesis(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(ch==')'){
                char top = stack.peek();
                if(top!='('){
                    return false;
                }
                stack.pop();
            }
            else if(ch=='}'){
                char top = stack.peek();
                if(top!='{'){
                    return false;
                }
                stack.pop();
            }
            else if(ch==']'){
                char top = stack.peek();
                if(top!='['){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
