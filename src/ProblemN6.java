public class ProblemN6 {
    public static void main(String[] args) {

    }

    public String convert(String s, int rowNums){
        for (int i = 0; i < rowNums; i++){
            int columns = s.length()/rowNums;
            System.out.println(s.charAt(i));
        }
        return "unsolved";
    }
}
