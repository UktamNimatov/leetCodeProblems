public class ProblemN168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(234));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(235));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        result.reverse();
        return result.toString();
    }
}
