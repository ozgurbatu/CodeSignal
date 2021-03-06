package IslandOfKnowledge;

import java.util.ArrayList;
import java.util.List;

public class IsPv4Address {
    /**
     * An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.
     * <p>
     * Given a string, find out if it satisfies the IPv4 address naming rules.
     * <p>
     * Example
     * <p>
     * For inputString = "172.16.254.1", the output should be
     * solution(inputString) = true;
     * <p>
     * For inputString = "172.316.254.1", the output should be
     * solution(inputString) = false.
     * <p>
     * 316 is not in range [0, 255].
     * <p>
     * For inputString = ".254.255.0", the output should be
     * solution(inputString) = false.
     * <p>
     * There is no first number.
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] string inputString
     * <p>
     * A string consisting of digits, full stops and lowercase English letters.
     * <p>
     * Guaranteed constraints:
     * 1 ≤ inputString.length ≤ 30.
     * <p>
     * [output] boolean
     * <p>
     * true if inputString satisfies the IPv4 address naming rules, false otherwise.

     */
    public static void main(String[] args) {
        System.out.println(solution("0.0.0.249"));
    }

    static boolean solution(String inputString) {
        String str="25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
        String arr[]=inputString.split("\\.");
        if (arr.length != 4) {
            return false;
        }
        for (String each: arr) {
            if (!each.matches(str)) {
                return false;
            }
        }
        return true;
    }

}
