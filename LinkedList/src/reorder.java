import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

 class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;


        ArrayList<ListNode> list = new ArrayList<>();
        ListNode curr = head;
        while(curr != null) {
            list.add(curr);
            curr = curr.next;
        }

        // Step 2: Reorder
        int i = 0;
        int j = list.size() - 1;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(i <= j) {
            if(i == j) {
                temp.next = list.get(i);
                temp = temp.next;
                break;
            }
            temp.next = list.get(i);
            temp = temp.next;
            temp.next = list.get(j);
            temp = temp.next;
            i++;
            j--;
        }

        temp.next = null; // Mark the end of the list
    }

    public void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        System.out.println("Original list:");
        solution.printList(head);

        solution.reorderList(head);

        System.out.println("Reordered list:");
        solution.printList(head);
    }
}
