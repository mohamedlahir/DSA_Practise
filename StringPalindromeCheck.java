import java.util.Arrays;
import java.util.Scanner;

public class StringPalindromeCheck {
    public static boolean isPalindrome(String s) {
        String wordToCheck=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]", "");
        String[] arr = wordToCheck.split("");
        String palindromeWord = "";
        for (int i = arr.length; i > 0; i--) {
            palindromeWord = palindromeWord + arr[i - 1];
        }
        if (wordToCheck.equals(palindromeWord)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String word = "A man, a plan, a canal: Panama";
//        String[] arr = word.toLowerCase().replace(" ", "").replace(",", "").replace(":", "").split("");
//        System.out.println(arr[0]);
//        String palindromeWord = "";
//        System.out.println(arr.length);
//        for (int i = arr.length; i > 0; i--) {
//
//            palindromeWord = palindromeWord + arr[i - 1];
//        }
//        System.out.println(palindromeWord);
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}