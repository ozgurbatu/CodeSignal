package EruptionOfLight;

public class IsMac48Address {
    /**
     * A media access control address (MAC address) is a unique identifier assigned to network interfaces for communications on the physical network segment.
     * <p>
     * The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).
     * <p>
     * Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.
     * <p>
     * Example
     * <p>
     * For inputString = "00-1B-63-84-45-E6", the output should be
     * solution(inputString) = true;
     * For inputString = "Z1-1B-63-84-45-E6", the output should be
     * solution(inputString) = false;
     * For inputString = "not a MAC-48 address", the output should be
     * solution(inputString) = false.
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] string inputString
     * <p>
     * Guaranteed constraints:
     * 15 ≤ inputString.length ≤ 20.
     * <p>
     * [output] boolean
     * <p>
     * true if inputString corresponds to MAC-48 address naming rules, false otherwise.
     */
    boolean solution(String inputString) {
        if (inputString.charAt(inputString.length() - 1) == '-') {
            return false;
        }
        String arr[] = inputString.split("-");
        if (arr.length != 6) {
            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                String q = arr[i];
                if (q.length() != 2) {
                    return false;
                } else {
                    for (int j = 0; j < 2; j++) {
                        if (((q.charAt(j) >= 'A') && (q.charAt(j) <= 'F')) || (Character.isDigit(q.charAt(j)))) {

                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
