package geeksForGeeks.stringsProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// This is not done by me, So need to look back again and Think about the logic
public class AnagramOfString {
    /**
     * Given two strings S1 and S2 in lowercase, the task is to make them anagram.
     * The only allowed operation is to remove a character from any string.
     * Find the minimum number of characters to be deleted to make both the strings anagram.
     * Two strings are called anagram of each other if one of them can be converted into another by rearranging its letters.
     * @param args
     */
    public static void main(String[] args) {
        String s1="basgadhbfgvhads";
        String s2 ="sjdhgvbjdsbhvbvd";

       System.out.println(checkAnagram(s1,s2));
    }
    static int checkAnagram(String s1,String s2){
        // Create lists to store characters of both strings
        List<Character> listS1 = new ArrayList<>();
        List<Character> listS2 = new ArrayList<>();

        // Populate lists with characters of s1 and s2
        for (char c : s1.toCharArray()) {
            listS1.add(c);
        }

        for (char c : s2.toCharArray()) {
            listS2.add(c);
        }

        int deletions = 0;

        // Iterate over characters in listS1
        for (char c : listS1) {
            if (listS2.contains(c)) {
                // If character is present in listS2, remove it from both lists
                listS2.remove((Character) c);
            } else {
                // If character is not present in listS2, it needs to be deleted
                deletions++;
            }
        }

        // Remaining characters in listS2 need to be deleted
        deletions =deletions + listS2.size();

        return deletions;
    }
}
