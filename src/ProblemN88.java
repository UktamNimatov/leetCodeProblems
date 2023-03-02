import java.util.Arrays;

public class ProblemN88 {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2, 5, 6}, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
