package projects.learning;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.isPalindrome(555));
        System.out.println(palindromeChecker.isPalindrome(-4664));
        System.out.println(palindromeChecker.isPalindrome(909));
        System.out.println(palindromeChecker.isPalindrome(33636));
        System.out.println(palindromeChecker.isPalindrome(0));
        System.out.println(palindromeChecker.isPalindrome(101));
    }
}
