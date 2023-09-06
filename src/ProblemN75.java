import java.util.Arrays;

public class ProblemN75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColorsLib(nums);
    }

    public static void sortColorsLib(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
