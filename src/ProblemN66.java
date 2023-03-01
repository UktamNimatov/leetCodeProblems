import java.math.BigInteger;
import java.util.Arrays;

public class ProblemN66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{3, 4, 6})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 0, 6})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{3, 9, 6})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 3, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        digits[digits.length-1]++;
        for(int i = digits.length-1; i >= 0; i--){
            digits[i] += carry;
            if(digits[i] >= 10){
                digits[i] -= 10;
                carry = 1;
            }
            else
                carry = 0;
        }
        if(carry == 1){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for(int i = 1; i < res.length; i++)
                res[i] = digits[i-1];
            return res;
        }
        return digits;
    }
}
