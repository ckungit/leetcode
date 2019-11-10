package study.ckun;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution21 {

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
        ListNode l12 = new ListNode(2);
        ListNode l14 = new ListNode(4);
        l1.next = l12;
        l12.next = l14;

        ListNode l2 = new ListNode(1);
        ListNode l23 = new ListNode(3);
        ListNode l24 = new ListNode(4);
        l2.next = l23;
        l23.next = l24;

        System.out.println(mergeLists(l1,l2));
    }

    public static ListNode mergeLists(ListNode l1, ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        if(l1.val < l2.val){
            l1.next = mergeLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeLists(l1, l2.next);
            return l2;
        }
    }
}
