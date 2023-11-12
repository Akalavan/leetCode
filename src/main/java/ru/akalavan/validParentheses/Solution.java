package ru.akalavan.validParentheses;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }

        Stack<Character> brackets = new Stack<>();
        for (char c : s.toCharArray()) {
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
