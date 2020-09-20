package palindromes;

import java.util.Scanner;

public class Main {

    static boolean isPalindrome (String s){
        if (s.length() <= 1) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }

    static void check(String word) {
        if (isPalindrome(word)) {
            System.out.println("YES, This word is a Palindrome!!");
        } else {
            System.out.println(("NAH!, not a Palindrome"));
        }
    }

    static void inputChecker() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = input.next();
        check(word);
    }

    public static void main(String[] args) {
        inputChecker();
    }
}
