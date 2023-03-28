import java.math.BigInteger;

public class ProblemN67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("0", "0"));
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public static String addBinary(String a, String b) {
        int j = a.length() - 1, k = b.length() - 1, carry = 0;
        StringBuilder builder = new StringBuilder();
        while (j >= 0 || k >= 0) {
            int sum = carry;
            if (j >= 0) sum += a.charAt(j--) - '0';
            if (k >= 0) sum += b.charAt(k--) - '0';
            builder.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) builder.append(carry);
        return builder.reverse().toString();
    }
}
