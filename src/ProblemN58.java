public class ProblemN58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("FLY ME TO THE MOON AND LET ME PLAY AMONG THE alksnlksdfg"));
    }

    public static int lengthOfLastWord(String s) {
        int length = s.length() - 1;
        int lastWordLength = 0;
        while (length >= 0) {
            if (Character.isWhitespace(s.charAt(length))) {
                length--;
                if (lastWordLength > 0) break;
                continue;
            }
            length--;
            lastWordLength++;
        }
        return lastWordLength;
    }
}
