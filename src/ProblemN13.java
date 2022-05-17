import java.util.*;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ProblemN13 {
    private static Logger logger = Logger.getLogger(String.valueOf(ProblemN13.class));

    public static void main(String[] args) {
        System.out.println(romanToInt("XIII"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LXXVII"));
        System.out.println(romanToInt("XCIV"));
        System.out.println(romanToInt("MMMCMXLIV"));
        System.out.println("anotherSolution()");
        System.out.println(anotherSolution("LXXVII"));
        System.out.println(anotherSolution("MMMCMXLIV"));
        System.out.println(anotherSolution("XCIV"));
        System.out.println(anotherSolution("LVIII"));
    }

    public static int romanToInt(String s){
        int toReturn = 0;
        Map<String, Integer> values = new LinkedHashMap<>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        Map<String, Integer> doubleValues = new LinkedHashMap<>();
        doubleValues.put("IV", 4);
        doubleValues.put("IX", 9);
        doubleValues.put("XL", 40);
        doubleValues.put("XC", 90);
        doubleValues.put("CD", 400);
        doubleValues.put("CM", 900);

        for (String currentKey : doubleValues.keySet()) {
            while (s.contains(currentKey)) {
                toReturn += doubleValues.get(currentKey);
                int index = s.indexOf(currentKey);
                StringBuilder stringBuilder = new StringBuilder(s);
                stringBuilder.setCharAt(index, 'T');
                stringBuilder.setCharAt(index+1, 'T');
                s = stringBuilder.toString();
            }
        }
        for (String currentKey : values.keySet()){
            while (s.contains(currentKey)){
                toReturn += values.get(currentKey);
                int index = s.indexOf(currentKey);
                StringBuilder stringBuilder = new StringBuilder(s);
                stringBuilder.setCharAt(index, 'T');
                s = stringBuilder.toString();
            }
        }

        return toReturn;
    }

    public static int anotherSolution(String s){
        int[] num = new int[s.length()];
        for (int i = 0; i < num.length; i++){
            switch (s.charAt(i)){
                case 'I' -> num[i] = 1;
                case 'V' -> num[i] = 5;
                case 'X' -> num[i] = 10;
                case 'L' -> num[i] = 50;
                case 'C' -> num[i] = 100;
                case 'D' -> num[i] = 500;
                case 'M' -> num[i] = 1000;
            }
        }
        int sum = 0;
        for (int i = 0; i < num.length - 1; i++){
                if (num[i] < num[i+1]){
                    sum -= num[i];
                }else {
                    sum += num[i];
                }
        }
        return sum + num[num.length - 1];
    }
}
