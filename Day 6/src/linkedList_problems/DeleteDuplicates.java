package linkedList_problems;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode listNode = head;

        while (listNode.next != null){
            if (listNode.next.val == listNode.val) {
                listNode.next = listNode.next.next;
            }
            else listNode = listNode.next;
        }

        return head;
    }
    public class ListNode {
        int val;
        ListNode next;

    }

}
