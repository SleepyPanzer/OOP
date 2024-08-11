class node {
    String name;
    String designation;
    String department;
    String company_name;
    node previous_node;
    node next_node;

    public node(String name, String designation, String department, String company_name) {
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.company_name = company_name;
        this.previous_node = null;
        this.next_node = null;
    }

    void display(node headNode) {
        node temp = headNode;
        while (temp != null) {
            System.out.println(
                    temp.name + " | " + temp.designation + " | " + temp.department + " | " + temp.company_name);
            temp = temp.next_node;
        }
    }

    node insertAtHead(node headNode, String name, String designation, String department, String company_name) {
        System.out.println("Inserting record of " + name + " at the head!");
        node node_to_insert = new node(name, designation, department, company_name);
        node_to_insert.next_node = headNode;
        headNode.previous_node = node_to_insert;
        return node_to_insert;
    }

    void insertAtTail(node headNode, String name, String designation, String department, String company_name) {
        System.out.println("Inserting record of " + name + " at the tail!");
        node node_to_insert = new node(name, designation, department, company_name);
        node temp = headNode;
        while (temp.next_node != null) {
            temp = temp.next_node;
        }
        temp.next_node = node_to_insert;
        node_to_insert.previous_node = temp;
    }

    node insertAtPosition(node headNode, int position, String name, String designation, String department,
            String company_name) {
        node temp = headNode;
        if (position == 1) {
            temp = insertAtHead(headNode, name, designation, department, company_name);
            return temp;
        }
        int pos = 1;
        while (pos != position - 1) {
            temp = temp.next_node;
            pos++;
        }
        if (temp.next_node == null) {
            insertAtTail(headNode, name, designation, department, company_name);
            return headNode;
        }
        System.out.println("Inserting record of " + name + " at position " + position);
        node node_to_insert = new node(name, designation, department, company_name);
        node_to_insert.previous_node = temp;
        node_to_insert.next_node = temp.next_node;
        temp.next_node.previous_node = node_to_insert;
        temp.next_node = node_to_insert;
        return headNode;
    }

    int search(node headNode, String name) {
        System.out.println("Searching " + name + "'s record from the list!");
        node temp = headNode;
        int position = 1;
        while (temp != null) {
            if (temp.name == name) {
                return position;
            }
            temp = temp.next_node;
            position++;
        }
        return -1;
    }
}

public class task1 {
    public static void main(String[] args) {
        node n1 = new node("SHAHEER", "MANAGER", "FINANCE", "PSO");
        node headNode = n1;
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
