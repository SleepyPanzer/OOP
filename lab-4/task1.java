class Node {
    String name;
    int rollno;
    Node next;

    public Node(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        this.next = null;
    }

    void display(Node ptr) {
        while (ptr != null) {
            System.out.println(ptr.name + ", " + ptr.rollno);
            ptr = ptr.next;
        }
    }

    Node insertAtBegining(Node headNode, String name, int rollno) {
        Node temp = new Node(name, rollno);
        temp.next = headNode;
        headNode = temp;
        return headNode;
    }

    void insertAtEnd(Node headNode, String name, int rollno) {
        Node temp = new Node(name, rollno);
        while (headNode.next != null) {
            headNode = headNode.next;
        }
        headNode.next = temp;
    }

    Node insertInMiddle(Node headNode, int position, String name, int rollno) {
        if (position == 1) {
            return insertAtBegining(headNode, name, rollno);
        }
        Node temp = new Node(name, rollno);
        int pos = 1;
        Node current = headNode;
        while (current != null) {
            if (pos == position - 1) {
                temp.next = current.next;
                current.next = temp;
                return headNode;
            }
            current = current.next;
            pos++;
        }
        return headNode;
    }

    int search(Node headNode, String name) {
        int position = 1;
        while (headNode != null) {
            if (headNode.name == name) {
                return position;
            }
            headNode = headNode.next;
            position++;
        }
        return -1;
    }

    void delete(Node headNode, int position) {
        int pos = 1;
        Node previousNode = null;
        Node currentNode = headNode;
        if (position == 1) {
            headNode = headNode.next;
            return;
        }
        while (currentNode != null && pos != position) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            pos++;
        }
        if (currentNode != null) {
            previousNode.next = currentNode.next;
        }
    }
}

public class task1 {
    public static void main(String[] args) {

        Node n1 = new Node("shaheer", 1);
        Node n2 = new Node("ashir", 9);
        Node n3 = new Node("john", 16);
        Node n4 = new Node("adbullah", 23);
        Node n5 = new Node("zaid", 24);
        Node n6 = new Node("zayan", 29);
        Node n7 = new Node("murtaza", 38);
        Node n8 = new Node("Saad", 42);
        Node n9 = new Node("Farhan", 45);
        Node n10 = new Node("obaid", 138);

        Node headNode = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = null;

        System.out.println("Viewing the original list");
        n1.display(headNode);

        System.out.println("\nInserting elements at different locations of the list");
        headNode = n1.insertAtBegining(headNode, "Sunny", 8);
        headNode = n1.insertInMiddle(headNode, 1, "Bobby", 25);
        n1.insertAtEnd(headNode, "Hammad", 238);
        n1.display(headNode);

        String nameToSearch = "Murtaza";
        System.out.println("\nSearching " + nameToSearch + " from the list");
        int position = n1.search(headNode, nameToSearch);
        System.out.println("Position of " + nameToSearch + " is " + position);

        int positionToDelete = 6;
        System.out.println("\nDeleting element at position " + positionToDelete + " from the list");
        n1.delete(headNode, positionToDelete);
        n1.display(headNode);
    }
}
