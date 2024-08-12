class Node {
    String name;
    String designation;
    String department;
    String companyName;
    Node previousNode;
    Node nextNode;

    public Node(String name, String designation, String department, String company_name) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.companyName = companyName;
        this.previousNode = null;
        this.nextNode = null;
    }

    void display(Node headNode) {
        Node temp = headNode;
        while (temp != null) {
            System.out.println(
                    temp.name + " | " + temp.designation + " | " + temp.department + " | " + temp.companyName);
            temp = temp.nextNode;
        }
    }

    Node insertAtHead(Node headNode, String name, String designation, String department, String companyName) {
        System.out.println("Inserting record of " + name + " at the head!");
        Node nodeToInsert = new Node(name, designation, department, companyName);
        nodeToInsert.nextNode = headNode;
        headNode.previousNode = nodeToInsert;
        return nodeToInsert;
    }

    void insertAtTail(Node headNode, String name, String designation, String department, String companyName) {
        System.out.println("Inserting record of " + name + " at the tail!");
        Node nodeToInsert = new Node(name, designation, department, companyName);
        Node temp = headNode;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = nodeToInsert;
        nodeToInsert.previousNode = temp;
    }

    Node insertAtPosition(Node headNode, int position, String name, String designation, String department,
            String companyName) {
                Node temp = headNode;
        if (position == 1) {
            temp = insertAtHead(headNode, name, designation, department, companyName);
            return temp;
        }
        int pos = 1;
        while (pos != position - 1) {
            temp = temp.nextNode;
            pos++;
        }
        if (temp.nextNode == null) {
            insertAtTail(headNode, name, designation, department, companyName);
            return headNode;
        }
        System.out.println("Inserting record of " + name + " at position " + position);
        Node node_to_insert = new Node(name, designation, department, companyName);
        node_to_insert.previousNode = temp;
        node_to_insert.nextNode = temp.nextNode;
        temp.nextNode.previousNode = node_to_insert;
        temp.nextNode = node_to_insert;
        return headNode;
    }

    int search(Node headNode, String name) {
        System.out.println("Searching " + name + "'s record from the list!");
        Node temp = headNode;
        int position = 1;
        while (temp != null) {
            if (temp.name.equals(name)) {
                return position;
            }
            temp = temp.nextNode;
            position++;
        }
        return -1;
    }
}

public class task1 {
    public static void main(String[] args) {
        Node n1 = new Node("SHAHEER", "MANAGER", "FINANCE", "PSO");
        Node headNode = n1;
        System.out.println("Initially Doubly Linked List was: ");
        n1.display(headNode);
        System.out.println("\nInserting data at different positions of the list!");
        headNode = n1.insertAtHead(headNode, "ALTAF", "LABOUR", "CLEANING", "SHELL");
        headNode = n1.insertAtPosition(headNode, 2, "FARHAN", "DRIVER", "DRIVE", "PAPMERS");
        n1.insertAtTail(headNode, "ASIM", "BOSS", "MALIR", "HELLO");
        n1.display(headNode);
        System.out.println("\nSearching records name wise from the list!");
        String record_to_search = "SHAHEER";
        int position = n1.search(headNode, "SHAHEER");
        System.out.println(record_to_search + "'s record was found at position " + position);
    }
}
