package LandOfLogic;

import java.util.ArrayList;
import java.util.List;

public class FileNaming {
    /**
     You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

     Return an array of names that will be given to the files.

     Example

     For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
     solution(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].

     Input/Output

     [execution time limit] 3 seconds (java)

     [input] array.string names

     Guaranteed constraints:
     5 ≤ names.length ≤ 1000,
     1 ≤ names[i].length ≤ 15.
     */
    String[] solution(String[] names) {
        List<String> newNames = new ArrayList<>();
        for(int i=0; i<names.length; i++) {
            String tempName = names[i];
            int reps = wordReps(newNames, tempName, names, i);
            if(reps>0)
                tempName = names[i] + "(" + reps + ")";
            while(wordReps(newNames, tempName, names, i)>0) {
                reps++;
                tempName = names[i] + "(" + reps + ")";
            }
            newNames.add(tempName);
        }
        return newNames.toArray(new String[newNames.size()]);
    }

    int wordReps(List<String> words, String word, String[] names, int index) {
        int counter = 0, nameCounter = 0;
        for(int i=0; i<index; i++)
            if(names[i].equals(word)) nameCounter++;
        for(int i=0; i<words.size(); i++)
            if(words.get(i).equals(word)) counter++;
        return (counter>nameCounter)? counter: nameCounter;
    }

}
