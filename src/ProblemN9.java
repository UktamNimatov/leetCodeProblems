public class ProblemN9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3));;
        System.out.println(isPalindrome(121));;
        System.out.println(isPalindrome(3324));;
        System.out.println(isPalindrome(3333));;
        System.out.println(isPalindrome(678));;
        System.out.println(isPalindrome(7));;
    }

    public static boolean isPalindrome(int x){
        if (x < 10 && x >= 0){
            return true;
        }
        if (x < 0){
            return false;
        }
        int y = x;
        int remainder;
        int pal = 0;
        while (y > 0){
            pal = pal * 10;
            remainder = y % 10;
            y = y / 10;
            pal = pal + remainder;
        }
        return pal == x;
    }
}
