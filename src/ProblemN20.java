import java.awt.event.ItemListener;
import java.util.Stack;

public class ProblemN20 {
    public static void main(String[] args) {
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char aChar : s.toCharArray()){
            if (aChar == '('){
                stack.push(')');
            }else if (aChar == '{'){
                stack.push('}');
            }else if (aChar == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != aChar){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
