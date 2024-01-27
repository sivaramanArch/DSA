import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LC_easy_345
 */
public class LC_easy_345 {

    public static List<Character> getVowels() {
        char[] charArray = { 'a', 'e', 'i', 'o', 'u' };
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        return charList;
    }

    public static String reverse(String s) {
        String toReturn = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            toReturn = toReturn + s.charAt(i);
        }

        return toReturn;
    }

    public static String reverseVowels(String s) {
        // leetcode
        // e: 1
        // e: 2
        // o: 4
        // e: 6

        // eeoe
        // eoee
        // leotcede

        int si = 0;
        int ei = s.length() - 1;

        char[] toReturn = s.toCharArray();

        while (si <= ei) {
            char start = s.charAt(si);
            char end = s.charAt(ei);

            // if both are vowels swap and inc counter
            if (getVowels().contains(start) && getVowels().contains(end)) {
                char temp = end;
                toReturn[ei] = toReturn[si];
                toReturn[si] = temp;

                si += 1;
                ei -= 1;
            }

            // if either si is a consonant or ei is a consonant decrement/increment the
            // counter
            if (!getVowels().contains(start)) {
                si += 1;
            }

            if (!getVowels().contains(end)) {
                ei -= 1;
            }

        }

        return toReturn.toString();
    }

    
}