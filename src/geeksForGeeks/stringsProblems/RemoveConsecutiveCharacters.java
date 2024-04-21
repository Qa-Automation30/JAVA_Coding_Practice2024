package geeksForGeeks.stringsProblems;

public class RemoveConsecutiveCharacters {
    /**
     * S = aabb
     * Output:  ab
     * Explanation: 'a' at 2nd position is appearing 2nd time consecutively.
     * Similiar explanation for b at
     * 4th position.
     * =============================
     * S = aabaa
     * Output:  aba
     * Explanation: 'a' at 2nd position is appearing 2nd time consecutively. a' at fifth position is appearing
     * 2nd time consecutively.
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "aabaa";
       System.out.println(removeConsecutiveChar(str));
    }

    static String  removeConsecutiveChar(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if (i < str.length() - 1 && currentChar == str.charAt(i + 1)) {
                continue;
            }
            result.append(currentChar);
        }
      return result.toString();
    }
}
