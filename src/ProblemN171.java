public class ProblemN171 {

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
        System.out.println(anotherWay("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char column = columnTitle.charAt(i);
            int columnIntValue = 0;
            if (column >= 'A' && column <= 'Z') {
                columnIntValue = column - 64;
                System.out.println("columnIntValue= " + columnIntValue);
            }
            result = (int) (result + columnIntValue * Math.pow(26, columnTitle.length() - 1 - i));
            System.out.println("result= " + result);
        }
        return result;
    }

    public static int anotherWay(String columnTitle) {
        int sum = 0;
        for (char element : columnTitle.toCharArray()) {
            sum *= 26;
            sum = sum + element - 'A' + 1;
        }
        return sum;
    }
}
