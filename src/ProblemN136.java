public class ProblemN136 {
    public static void main(String[] args) {
        int[] ints = {2,2,1};
        int[] ints1 = {4, 5, 8, 90, 4, 5, 90};
        System.out.println(anotherSingleNumber(ints));
        System.out.println(anotherSingleNumber(ints1));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) break;
                if (j == nums.length - 1) {
                   return nums[i];
                }
            }
        }
        return 0;
    }

    public static int anotherSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}
