package problem83;

public class ProblemN83 {
    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(3, new ListNode(5, new ListNode(5, new ListNode(6))))));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            while (temp.next != null && temp.next.val == temp.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
