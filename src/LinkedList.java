//uc1 create a simple linked list

// Node class represents a node in a linked list
class Node {
    int data; // Data of the node
    Node next; // Reference to the next node in the list

    // Constructor to initialize a node with given data
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, the next node is set to null
    }
}

// MyLinkedList class manages the linked list operations
class MyLinkedList {
    Node head; // The starting point of the linked list

    // Method to add a new node with given data to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node with the provided data

        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
        } else {
            // If the list is not empty, traverse to the end and add the new node
            Node current = head;
            while (current.next != null) {
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Set the new node as the next node of the last node
        }
    }

    // Method to display the contents of the linked list
    public void display() {
        Node current = head; // Start from the head of the list
        while (current != null) {
            System.out.print(current.data + " "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line after displaying all nodes
    }
}

// ExampleLinkedList class demonstrates the usage of MyLinkedList
public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(); // Create an instance of MyLinkedList

        // Add nodes with data 12, 13, and 14 to the linked list
        myLinkedList.add(12);
        myLinkedList.add(13);
        myLinkedList.add(14);

        System.out.println("Linked List:");
        myLinkedList.display(); // Display the contents of the linked list
    }
}
