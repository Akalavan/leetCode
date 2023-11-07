package ru.akalavan.palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversNumber = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversNumber = reversNumber * 10 + digit;
            temp /= 10;
        }

        return x == reversNumber;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isPalindrome(1011));
    }
}
