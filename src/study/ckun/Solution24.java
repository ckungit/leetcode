package study.ckun;

public class Solution24 {
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
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        System.out.println("递归: " + swapPairsRecu(l1));
//        System.out.println("非递归: "+ swapPairsNom(l1));
    }

    public static ListNode swapPairsRecu(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairsRecu(next.next);
        next.next = head;
        return next;
    }

    public static ListNode swapPairsNom(ListNode head){
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null){
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }
}
