package IslandOfKnowledge;

public class AreEquallyStrong {
    /**
     * Call two arms equally strong if the heaviest weights they each are able to lift are equal.
     * <p>
     * Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.
     * <p>
     * Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
     * <p>
     * Example
     * <p>
     * For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should be
     * solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
     * For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should be
     * solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
     * For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should be
     * solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] integer yourLeft
     * <p>
     * A non-negative integer representing the heaviest weight you can lift with your left arm.
     * <p>
     * Guaranteed constraints:
     * 0 ≤ yourLeft ≤ 20.
     * <p>
     * [input] integer yourRight
     * <p>
     * A non-negative integer representing the heaviest weight you can lift with your right arm.
     * <p>
     * Guaranteed constraints:
     * 0 ≤ yourRight ≤ 20.
     * <p>
     * [input] integer friendsLeft
     * <p>
     * A non-negative integer representing the heaviest weight your friend can lift with his or her left arm.
     * <p>
     * Guaranteed constraints:
     * 0 ≤ friendsLeft ≤ 20.
     * <p>
     * [input] integer friendsRight
     * <p>
     * A non-negative integer representing the heaviest weight your friend can lift with his or her right arm.
     * <p>
     * Guaranteed constraints:
     * 0 ≤ friendsRight ≤ 20.
     * <p>
     * [output] boolean
     * <p>
     * true if you and your friend are equally strong, false otherwise.
     */

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        boolean sonuc = false;

        if ((yourLeft + yourRight) == (friendsLeft + friendsRight)) {
            if (yourLeft == friendsLeft || yourLeft == friendsRight) {
                sonuc = true;
            }
        } else {
            sonuc = false;
        }
        return sonuc;
    }
}
