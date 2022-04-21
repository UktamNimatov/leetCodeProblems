import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//Return the sum of the three integers.


public class ProblemN16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
        System.out.println(threeSumClosest(new int[]{0, 0, 0}, 1));

    }


    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int sumToReturn = nums[0] + nums[1] + nums[nums.length-1];
        for (int i = 0; i < nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length-1;
            while (start < end){
                int tempSum = nums[i] + nums[start] + nums[end];
                if (tempSum > target){
                    end--;
                }else {
                    start++;
                }
                if (Math.abs(sumToReturn - target) > Math.abs(tempSum - target)){
                    sumToReturn = tempSum;
                }
            }
        }
        return sumToReturn;
    }

}
