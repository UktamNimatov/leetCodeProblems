import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ProblemN14 {

    public static void main(String[] args) {

        var masd = 1;
//        String[] strings = {"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(strings));
//        String[] strs = {"dog","racecar","car"};
//        System.out.println(longestCommonPrefix(strs));
//        String[] strings1 = {"fovkasjdsad", "fovooo", "fovik", "fov", ""};
//        System.out.println(longestCommonPrefix(strings1));
//        String[] strings2 = {"ab", "a"};
//        System.out.println(longestCommonPrefix(strings2));
        String[] strings3 = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(strings3));
//        String[] strings4 = {""};
//        System.out.println(longestCommonPrefix(strings4));
    }

    public static String longestCommonPrefix(String[] strs){
        List<Integer> lengths = new ArrayList<>();
//        if (strs.length == 0 ) return "";
        for (String aWord : strs){
            System.out.println("inside the loop");
            lengths.add(aWord.length());
            if (aWord.length() == 0){
                return "";
            }
        }
        Collections.sort(lengths);
//        lengths.sort(Comparator.naturalOrder());
        int minLength = lengths.get(0);

        StringBuilder toReturn = new StringBuilder();
        for(int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
//                System.out.println((strs[0].substring(0, i+1).equals(strs[j].substring(0, i+1))));
                    if (!(strs[0].substring(0, i + 1).equals(strs[j].substring(0, i + 1)))) {
                        break;
                    } else {
                        if ((strs.length - 1) == j) {

//                            if (toReturn.length() != 0) toReturn.delete(0, toReturn.length());
                            toReturn.append(strs[j], i, i + 1);
//                        System.out.println(toReturn.toString());
                        }
                    }
            }
        }
         return toReturn.toString();
    }
}
