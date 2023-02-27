public class ProblemN35 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 7, 20, 111, 234, 900};
        int target = 50;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end = mid - 1;
            if(nums[mid] < target) start = mid + 1;
        }
        return start;
    }
}
