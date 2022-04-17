public class ProblemN11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxAreaEfficientApproach(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height){
        int max = Integer.MIN_VALUE;
        int tempMaxArea;
        for (int i = 0; i < height.length - 1; i++){
            for (int j = i + 1; j < height.length; j++){
                tempMaxArea = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(tempMaxArea, max);
            }
        }
        return max;
    }

    public static int maxAreaEfficientApproach(int[] height){
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int maxArea = Math.min(height[left], height[right]) * (right - left);
        while (left < right){
            if (height[left] <= height[right]){
                left++;
            }else {
                right--;
            }
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        }
        return maxArea;
    }
}
