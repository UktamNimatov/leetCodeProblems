public class ProblemN125 {
    public static void main(String[] args) {
        System.out.println(Character.isLetter(4));
        System.out.println(Character.isDigit('F'));
        System.out.println(Character.isLetter('s'));
        System.out.println(Character.isDigit(0));
        System.out.println("><<><><><><><><><><><><><><><><>");
        System.out.println(convert("asd4g l2,3cc"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("A man, a plan, sa canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        s = convert(s);
        int length = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (i < length) {
                if (s.charAt(i) == s.charAt(length)) {
                    length--;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return true;
    }

    public static String convert(String s) {
        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))
                || Character.isDigit(s.charAt(i))) {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
