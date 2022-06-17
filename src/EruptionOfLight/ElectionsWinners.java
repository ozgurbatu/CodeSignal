package EruptionOfLight;

public class ElectionsWinners {
    /**
     * Elections are in progress!
     * <p>
     * Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.
     * <p>
     * The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.
     * <p>
     * Example
     * <p>
     * For votes = [2, 3, 5, 2] and k = 3, the output should be
     * solution(votes, k) = 2.
     * <p>
     * The first candidate got 2 votes. Even if all of the remaining 3 candidates vote for him, he will still have only 5 votes, i.e. the same number as the third candidate, so there will be no winner.
     * The second candidate can win if all the remaining candidates vote for him (3 + 3 = 6 > 5).
     * The third candidate can win even if none of the remaining candidates vote for him. For example, if each of the remaining voters cast their votes for each of his opponents, he will still be the winner (the votes array will thus be [3, 4, 5, 3]).
     * The last candidate can't win no matter what (for the same reason as the first candidate).
     * Thus, only 2 candidates can win (the second and the third), which is the answer.
     * <p>
     * Input/Output
     * <p>
     * [execution time limit] 3 seconds (java)
     * <p>
     * [input] array.integer votes
     * <p>
     * A non-empty array of non-negative integers. Its ith element denotes the number of votes cast for the ith candidate.
     * <p>
     * Guaranteed constraints:
     * 4 ≤ votes.length ≤ 105,
     * 0 ≤ votes[i] ≤ 104.
     * <p>
     * [input] integer k
     * <p>
     * The number of voters who haven't cast their vote yet.
     * <p>
     * Guaranteed constraints:
     * 0 ≤ k ≤ 105.
     * <p>
     * [output] integer
     */
    int solution(int[] votes, int k) {
        if (k == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < votes.length; i++) {
                if (votes[i] > max) {
                    max = votes[i];
                }
            }
            int count1 = 0;
            for (int i = 0; i < votes.length; i++) {
                if (votes[i] == max) {
                    count1++;
                }
            }
            if (count1 > 1) {
                return 0;
            } else {
                return 1;
            }
        }
        int count = 0;
        for (int i = 0; i < votes.length; i++) {
            int flag = 0;
            int temp = votes[i] + k;
            for (int j = 0; j < votes.length; j++) {
                if (temp <= votes[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        return count;
    }
}
