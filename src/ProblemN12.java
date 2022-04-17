public class ProblemN12 {
    public static void main(String[] args) {
        System.out.println(intToRomanAnotherSolution(2835));
    }

    public static String intToRomanGivenSolution(int num){
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }

    public static String intToRomanAnotherSolution(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        while(num > 0)
        {
            for(int i = 0 ; i < values.length; i++)
            {
                if(num >= values[i])
                {
                    result.append(roman[i]);
                    num -= values[i];
                    break;
                }
            }
        }

        return result.toString();
    }
}
