import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProblemN15 {
    public static void main(String[] args) {
        int[] ints = {3, 4, 5, 6, 6};
        System.out.println(threeSum(new int[]{3, 4}));
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> toReturn = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++){
            if (i == 0 || nums[i] != nums[i - 1]){
                int left = i + 1;
                int right = nums.length - 1;
                int sum = -nums[i];
                while (left < right) {
                    if ((nums[left] + nums[right]) == sum) {
                        toReturn.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }else if ((nums[left] + nums[right]) < sum) {
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return toReturn;
    }

    public static List<List<Integer>> threeSumBestSolution(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>(); //announcing a list of integers to return
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = -num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}

