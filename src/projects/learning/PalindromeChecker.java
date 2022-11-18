package projects.learning;

public class PalindromeChecker{
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        if(number == 0){
            return true;
        }
        if(number == reverseNumber(number)){
            return true;
        }else{
            return false;
        }
    }

    static int reverseNumber(int number){
        int reversedNumber = 0;
        int remainder;
        while(number > 0){
            remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number = number / 10;
        }
        return reversedNumber;
    }
}
