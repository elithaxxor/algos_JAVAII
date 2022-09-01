public class ReverseLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int tmp){
            data = tmp;
        }
    }
    static Node reverseLinkedList(Node node) {
        Node previous = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}

