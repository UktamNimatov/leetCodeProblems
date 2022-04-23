import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemN17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("234"));
        System.out.println(letterCombinations("5678"));
//        letterCombinations("2");
//        letterCombinations("254");
//        letterCombinations("2547");

    }

    public static List<String> letterCombinations(String digits) {
        int length = digits.length();
        if (!digits.equals("")) {
            int number = Integer.parseInt(digits);

        int remainder;
        String[] numbersInString = new String[length];
        while (length>0){
        String tempString = null;
            remainder = number % 10;
            switch (remainder){
                case 2 -> {tempString = "abc";}
                case 3 -> {tempString = "def";}
                case 4 -> {tempString = "ghi";}
                case 5 -> {tempString = "jkl";}
                case 6 -> {tempString = "mno";}
                case 7 -> {tempString = "pqrs";}
                case 8 -> {tempString = "tuv";}
                case 9 -> {tempString = "wxyz";}
            }
            numbersInString[length-1] = tempString;
            number /= 10;
            length -= 1;
        }
        List<String> strings = new ArrayList<>();
//        for (String s : numbersInString) {
//            System.out.println(s);
//        }
        if (numbersInString.length == 1){
            for (int i = 0; i < numbersInString[0].length(); i++){
                strings.add(numbersInString[0].substring(i, i + 1));
            }
        }
        if (numbersInString.length == 2){
            for (int i = 0; i < numbersInString[0].length(); i++){
                for (int j = 0; j < numbersInString[1].length(); j++){
                    strings.add(numbersInString[0].substring(i, i + 1) + numbersInString[1].substring(j, j + 1));
                }
            }
        }
        if (numbersInString.length == 3) {
            strings = threeDigits(numbersInString);
        }

        if (numbersInString.length == 4){
            System.out.println(Arrays.toString(numbersInString));
            String[] copied = new String[3];
            for (int i = 0; i < 3; i++){
                copied[i] = numbersInString[i];
            }
            System.out.println(Arrays.toString(numbersInString));
            List<String> threeLetterWords = threeDigits(copied);
            System.out.println(threeLetterWords);
            for (String aWord : threeLetterWords){
                for (int i = 0; i < numbersInString[3].length(); i++){
                    strings.add(aWord.concat(numbersInString[3].substring(i, i+1)));
                }
            }
        }


//        System.out.println(strings);
        return strings;
        }else {
            return new ArrayList<>();
        }
    }

    public static List<String> threeDigits(String[] numbersInString){
        List<String> toReturn = new ArrayList<>();
        for (int i = 0; i < numbersInString.length - 2; i++) {
            for (int j = i + 1; j < numbersInString.length - 1; j++) {
                for (int m = j + j; m < numbersInString.length; m++) {
                    for (int k = 0; k < numbersInString[i].length(); k++) {
                        for (int l = 0; l < numbersInString[j].length(); l++) {
                            for (int n = 0; n < numbersInString[m].length(); n++) {
                                toReturn.add(numbersInString[i].substring(k, k + 1) + numbersInString[j].substring(l, l + 1) +
                                        numbersInString[m].substring(n, n+1));
                            }
                        }
                    }
                }
            }
        }
        return toReturn;
    }
}
