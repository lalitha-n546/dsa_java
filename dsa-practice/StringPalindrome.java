// Question:Check whether the given user string is palindrome or not.
import java.util.*;

public class StringPalindrome {
    
    static String ispalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return "Invalid input. Please enter a valid word.";
        }

        int n = word.length();
        int c = 0;


        for (int i = 0; i < n; i++) {
            if (word.charAt(i) == word.charAt(n - i - 1)) {
                c++;
            }
        }

        if (n == c) {
            return "It's a Palindrome.";
        } else {
            return "It's not a Palindrome.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word of your choice: ");
        String word = sc.nextLine();
        System.out.println(ispalindrome(word));
        sc.close();
    }
}
