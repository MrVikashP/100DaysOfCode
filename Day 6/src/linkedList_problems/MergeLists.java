package linkedList_problems;
// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;

        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        while (list1 != null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }

        while (list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return head.next;
    }
    public class ListNode {
        int val;
        ListNode next;

    }
}
