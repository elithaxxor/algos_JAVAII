import java.util.Stack;

// Palindrone requires a linked list to traverse and stack to move data.

public class Palindrone {

    // Linked List Node
    private class Node {
        private int value;
        private Node next;
    }
    public boolean palindrome(Node n) {
        Node currentNode = n;
        Node nextNode = n;
        Stack <Integer> stack = new Stack<>;
        System.out.println("Node \n" +n);
        System.out.println("stack \n" + stack.toString());

        // Edge Case --> if node is null, we reach the end.
        while (nextNode != null && nextNode.next != null ) {
            System.out.println("traversing.. ");
            stack.push(currentNode.value);
            currentNode = nextNode.next;
            nextNode = nextNode.next.next;
        }
        if (nextNode != null) {
            currentNode = currentNode.next;

            // pop items off of stack and compare
            while (currentNode != null) {
                if (stack.pop().intValue() != currentNode.value) return false;
                currentNode = currentNode.next;
            }
            return true;
        }
    }

    public static void main (String args[]) {
        System.out.println("Starting palindrone detection.. ");
        Palindrone run = new Palindrone();
        run.palindrome(Node n);
    }
}
