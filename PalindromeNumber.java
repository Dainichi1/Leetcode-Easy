package it.leetcode.Esercizio2.PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Convert the number to a reversed integer
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }

        // Check if the original number and the reversed number are the same
        return original == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber sol = new PalindromeNumber();
        System.out.println(sol.isPalindrome(121));   // true
        System.out.println(sol.isPalindrome(-121));  // false
        System.out.println(sol.isPalindrome(10));    // false
    }
}

