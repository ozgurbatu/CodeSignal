package ExploringtheWaters;

import java.util.ArrayList;
import java.util.List;

public class AddBorder {
    /**
     * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
     * <p>
     * Example
     * <p>
     * For
     * <p>
     * picture = ["abc",
     * "ded"]
     * the output should be
     * <p>
     * solution(picture) = ["*****",
     * "*abc*",
     * "*ded*",
     * "*****"]
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] array.string picture
     * <p>
     * A non-empty array of non-empty equal-length strings.
     * <p>
     * Guaranteed constraints:
     * 1 ≤ picture.length ≤ 100,
     * 1 ≤ picture[i].length ≤ 100.
     * <p>
     * [output] array.string
     * <p>
     * The same matrix of characters, framed with a border of asterisks of width 1.
     */

    String[] solution(String[] picture) {
        String asterisks = "";

        List<String> list = new ArrayList<>();

        int uzunluk = picture[0].length();

        for (int i = 0; i < uzunluk + 2; i++) {
            asterisks += "*";
        }

        for (int i = 0; i < picture.length; i++) {
            picture[i] = "*" + picture[i] + "*";
        }
        list.add(asterisks);
        for (int i = 0; i < picture.length; i++) {
            list.add(picture[i]);
        }
        list.add(asterisks);

        return list.toArray(new String[list.size()]);
    }

}
