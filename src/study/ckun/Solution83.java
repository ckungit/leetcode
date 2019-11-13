package study.ckun;

public class Solution83 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            if(next == null){
                return String.valueOf(val);
            }else{
                return val + "," + next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        System.out.println(deleteDuplicates(l1));
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }
}
