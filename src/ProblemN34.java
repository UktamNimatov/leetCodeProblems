import java.util.Arrays;

public class ProblemN34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{}, 6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int startPos = -1;
        int endPos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && startPos == -1) {
                startPos = i;
            }
            if (nums[i] == target && startPos != -1) {
                endPos = i;
            }
        }
        return new int[]{startPos, endPos};
    }
}
