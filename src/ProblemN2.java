import java.util.logging.Logger;

public class ProblemN2 {
    private static Logger myLogger = Logger.getLogger(ProblemN2.class.getName());
    public static void main(String[] args) {
        ListNode returned = addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))), new ListNode(4));
        System.out.println(returned.val);
        System.out.println(returned.next.next.val);
        System.out.println(returned.next.val);
        System.out.println(returned.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode toReturn, temp = new ListNode();
        toReturn = temp;
        StringBuilder firstValue = new StringBuilder();
        StringBuilder secondValue = new StringBuilder();
        while (l1 != null) {
            firstValue.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            secondValue.append(l2.val);
            l2 = l2.next;
        }

        myLogger.info(firstValue.toString());
        myLogger.info(secondValue.toString());

        int first = Integer.parseInt(firstValue.toString());
        int second = Integer.parseInt(secondValue.toString());

        myLogger.info(String.valueOf(first));
        myLogger.info(String.valueOf(second));

        int sum = first + second;
        myLogger.info("sum=====> "+String.valueOf(sum));

        while (sum != 0){
            toReturn.next = new ListNode(sum % 10);
            myLogger.info("remainder is: "+String.valueOf(sum%10));
            sum /= 10;
            toReturn = toReturn.next;
            myLogger.info("value of sum after division => " + String.valueOf(sum));
        }
        return temp;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
