public class Task3 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class LinkedList {

        public static ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            return prev;
        }

        public static void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) {
                    System.out.print("->");
                }
                current = current.next;
            }
            System.out.println();
        }

        public void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            System.out.println("Original List:");
            printList(head);

            ListNode reversedHead = reverseList(head);

            System.out.println("Reversed List:");
            printList(reversedHead);
        }
    }


}
