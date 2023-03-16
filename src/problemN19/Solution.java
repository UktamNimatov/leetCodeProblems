package problemN19;

public class Solution {
    public static void main(String[] args) {

    }

    public ListNode remoteNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode result = new ListNode();
        head.val = result.val;
        while (head.next != null) {
            length++;
        }
        return result;
    }
}
