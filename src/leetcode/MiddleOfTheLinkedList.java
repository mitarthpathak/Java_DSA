package leetcode;

public class MiddleOfTheLinkedList {

    public node middleNode(node head) {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(5);

        MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
        node middle = solution.middleNode(head);

        System.out.println("Middle Node value: " + middle.data);
    }
}