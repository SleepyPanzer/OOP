   class node {
    String name;
    int rollno;
    node next;

    public node(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
        this.next = null;
    }

    void display(node ptr) {
        while (ptr != null) {
            System.out.println(ptr.name + ", " + ptr.rollno);
            ptr = ptr.next;
        }
    }

    node insertAbeg(node headNode, String name, int rollno) {
        node temp = new node(name, rollno);
        temp.next = headNode;
        headNode = temp;
        return headNode;
    }

    void insertAtend(node headNode, String name, int rollno) {
        node temp = new node(name, rollno);
        while (headNode.next != null) {
            headNode = headNode.next;
        }
        headNode.next = temp;
    }

    node insertInMid(node headNode, int position, String name, int rollno) {
        if (position == 1) {
            return insertAbeg(headNode, name, rollno);
        }
        node temp = new node(name, rollno);
        int pos = 1;
        node current = headNode;
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

    int search(node headNode, String name) {
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

    void delete(node headNode, int position) {
        int pos = 1;
        node previousNode = null;
        node currentNode = headNode;
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

        node n1 = new node("shaheer", 1);
        node n2 = new node("ashir", 9);
        node n3 = new node("john", 16);
        node n4 = new node("adbullah", 23);
        node n5 = new node("zaid", 24);
        node n6 = new node("zayan", 29);
        node n7 = new node("murtaza", 38);
        node n8 = new node("Saad", 42);
        node n9 = new node("Farhan", 45);
        node n10 = new node("obaid", 138);

        node headNode = n1;
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
        headNode = n1.insertAbeg(headNode, "Sunny", 8);
        headNode = n1.insertInMid(headNode, 1, "Bobby", 25);
        n1.insertAtend(headNode, "Hammad", 238);
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


