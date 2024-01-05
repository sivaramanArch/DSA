
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class SingleLinkedList {
    Node head;
    Node tail;

    SingleLinkedList(int value) {
        head = new Node(value);
        tail = head;
    }

    void add(int value) {
        this.tail.next = new Node(value);
        this.tail = this.tail.next;
    }
}

public class NthNodeFromEnd {
    // given a linked list remove the n'th node from end of the SLL

    static Node removeNthNode(Node head, int n) {
        Node sn = head;
        Node en = head;
        Node prev = null;

        // Create a gap of 'N'
        int gapSize = n;
        while (gapSize > 0) {
            if (en == null) {
                throw new RuntimeException("N greater than size");
            }
            en = en.next;
            gapSize -= 1;
        }

        // move till en is null
        while (true) {
            if (en == null) {
                break;
            }

            prev = sn;
            sn = sn.next;
            en = en.next;
        }

        if (prev == null) {
            head = head.next;
            return head;
        }

        prev.next = sn.next;
        return head;
    }

    static void traverseSLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // 12 → 15 → 13 → 16 → 17 → 14 → NULL

        SingleLinkedList sll = new SingleLinkedList(12);
        sll.add(15);
        sll.add(13);
        sll.add(16);
        sll.add(17);
        sll.add(14);

        Node newHead = removeNthNode(sll.head, 6);
        traverseSLL(newHead);
    }

}
