public class ProblemN70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }

    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] m = new int[n];
        m[0] = 1;
        m[1] = 2;

        for (int i = 2; i < n; i++) {
            m[i] = m[i-1] + m[i-2];
        }
        return m[n-1];
    }
}
