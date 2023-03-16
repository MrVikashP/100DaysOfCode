package linkedList_problems;
// https://leetcode.com/problems/sort-list/
public class SortList {
    private int size = 5; // let list size is 5
    private ListNode head;
    private ListNode tail;
    // using bubble sort
    public void bubbleSort() {
        bubbleSort(size - 1, 0);

    }
    public void bubbleSort(int row, int col) {
        if (row <= 0) {
            return;
        }

        if (col < row) {
            ListNode first = getNode(col);
            ListNode second = getNode(col + 1);

            if (first.val > second.val) {
                // if first ==  head
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if (second == tail){
                    ListNode temp = getNode(col - 1);
                    temp.next = second;
                    second.next = first;
                    tail = first;
                    tail.next = null;
                }
                else {
                    ListNode temp = getNode(col - 1);
                    temp.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
        else {
            bubbleSort(row - 1, 0);
        }
    }

    private ListNode getNode(int col) {
        // used for getting particular Node
        // discussed while learning singly LL
        return head;
    }

    // using merge sort, sorting the linked list
    // leet code solution below
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middleNode = getMiddleNode(head);

        ListNode left = sortList(head);
        ListNode right = sortList(middleNode);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode head = new ListNode();
        ListNode temp = head;

        while (left != null && right != null) {
            if (left.val < right.val) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
            else {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        temp.next = (left != null) ? left : right;

        return head.next;

    }

    private ListNode getMiddleNode(ListNode head) {
        ListNode prevMid = null;
        while (head != null && head.next != null) {
            prevMid = (prevMid == null) ? head : prevMid.next;
            head = head.next.next;
        }

        ListNode mid = prevMid.next;
        prevMid.next = null;
        return mid;
    }
    private class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }
    }
}
