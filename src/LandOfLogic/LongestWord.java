package LandOfLogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    /**
     Define a word as a sequence of consecutive English letters. Find the longest word from the given string.

     Example

     For text = "Ready, steady, go!", the output should be
     solution(text) = "steady".

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] string text

     Guaranteed constraints:
     4 ≤ text.length ≤ 50.

     [output] string

     The longest word from text. It's guaranteed that there is a unique output.
     */

    String solution(String text) {
        String patternString = "[A-Za-z]{1,50}";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
        String word = "";

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
            String tempWord = text.substring(matcher.start(), matcher.end());
            if(tempWord.length()>word.length())
                word = tempWord;
        }
        return word;
    }
}
