class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    void display(Node headNode) {
        while (headNode != null) {
            System.out.print(headNode.data + " ");
            headNode = headNode.next;
        }
    }

    Node reverse(Node headNode) {
        Node previous = null;
        Node current = headNode;
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

public class task2 {
    public static void main(String[] args) {
        Node n1 = new Node(16);
        Node n2 = new Node(23);
        Node n3 = new Node(24);
        Node n4 = new Node(29);
        Node n5 = new Node(38);

        Node headNode = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println("Original list was: ");
        n1.display(headNode);
        System.out.println("\nAfter reversing the list: ");
        headNode = n1.reverse(headNode);
        n1.display(headNode);
    }
}
