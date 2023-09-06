import java.util.Arrays;
import java.util.Map;

public class ProblemN121 {
    public static void main(String[] args) {
        int[] max = {7,1,5,3,6,4};
        System.out.println(maxProfit(max));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int min = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (min >= price) {
                min = price;
            } else {
                maxProfit = Math.max(maxProfit, price - min);
            }
        }
        return maxProfit;
    }
}
