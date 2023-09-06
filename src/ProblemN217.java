import java.util.HashSet;
import java.util.Set;

public class ProblemN217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println(containsDuplicate(new int[]{0,4,5,0,3,6}));
        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");
        System.out.println("<><><><><><><><><><><><><><><>");
        System.out.println(anotherDuplicate(new int[]{1,2,3,1}));
        System.out.println(anotherDuplicate(new int[]{1,2,3,4}));
        System.out.println(anotherDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
        System.out.println(anotherDuplicate(new int[]{0,4,5,0,3,6}));
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int l = i + 1; l < nums.length; l++) {
                if (nums[i] == nums[l]) {
                    return true;
                }
            }
        }
        return result;
    }

    public static boolean anotherDuplicate(int[] nums) {
        Set<Integer> integerHashSet = new HashSet<>();

        for (int num : nums) {
            if (integerHashSet.contains(num)) {
                return true;
            }
            integerHashSet.add(num);
        }
        return false;
    }
}
