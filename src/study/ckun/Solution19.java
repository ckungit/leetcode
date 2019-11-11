package study.ckun;

public class Solution19 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val) + (next != null? next:";");
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        System.out.println(removeNthFromEnd(l1, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode start = pre;
        ListNode end = pre;
        while(n != 0){
            start = start.next;
            n--;
        }
        while(start.next != null){
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
}
