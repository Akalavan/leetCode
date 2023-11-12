package ru.akalavan.validParentheses;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Stack<Character> brackets = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(') {
                brackets.push(')');
            } else if (c == '{') {
                brackets.push('}');
            } else if (c == '[') {
                brackets.push(']');
            } else if (brackets.isEmpty() || brackets.pop() != c) {
                return false;
            }
        }

        return brackets.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(("));
    }
}
