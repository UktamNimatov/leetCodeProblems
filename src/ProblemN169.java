public class ProblemN169 {
    public static void main(String[] args) {
        int[] nums = {7, 11, 12, 34, 45, 65, 65, 65, 65, 65, 65, 65, 4, 45, 65};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
               count--;
            }
        }
        return candidate;
    }
}
