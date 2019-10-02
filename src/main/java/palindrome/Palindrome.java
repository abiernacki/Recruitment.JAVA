package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "r", "s", "t", "u", "w", "x", "y", "z"};

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase();
        String[] wordTab = word.split("");
        String onlyLetters = "";

        for (int i = 0; i < wordTab.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                    if (wordTab[i].equals(letters[j])){
                        onlyLetters += wordTab[i];
                    }
            }
        }

        int length = onlyLetters.length();
        int lastLetter = length - 1;
        boolean isNoPalindrome = false;

        for (int i = 0; i < length; i++) {

            if (onlyLetters.charAt(i) != onlyLetters.charAt(lastLetter)) {
                isNoPalindrome = true;
                break;
            }
            lastLetter--;
        }

        if (isNoPalindrome) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
