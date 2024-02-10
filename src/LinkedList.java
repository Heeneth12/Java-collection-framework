//uc1 create a simple linked list
// Node class represents a node in a linked list
class Node<T> {
    T data; // Data of the node
    Node<T> next; // Reference to the next node in the list

    // Constructor to initialize a node with given data
    public Node(T data) {
        this.data = data;
        this.next = null; // Initially, the next node is set to null
    }
}

// MyLinkedList class manages the linked list operations
class MyLinkedList<T> {
    Node<T> head; // The starting point of the linked list

    // Method to add a new node with given data to the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<T>(data); // Create a new node with the provided data

        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
        } else {
            // If the list is not empty, traverse to the end and add the new node
            Node<T> current = head;
            // temp node current
            while (current.next != null) {
                // Move to the next node
            }
            current.next = newNode; // Set the new node as the next node of the last node
        }
    }

    // ---> adding at first
    public void addFirst(T data) {
        Node<T> addFirstPosNode = new Node<T>(data);
        addFirstPosNode.next = head;
        // making next part [] == null
        head = addFirstPosNode;
        // putting address in head

    }

    // Method to add a new node with given data at a specific position in the linked
    // list
    public void addInBetween(T data, int position) {
        Node<T> newNode = new Node<T>(data); // Create a new node with the provided data

        if (position < 0) {
            System.out.println("Invalid position. Position should be non-negative.");
            return;
        }

        if (position == 0) {
            // If the position is 0, add the new node at the beginning
            addFirst(data);
        } else {
            // If the position is greater than 0, traverse to the specified position and add
            // the new node
            Node<T> current = head;
            for (int i = 1; i < position && current != null; i++) {
                // Traverse to the specified position or until the end of the list
                current = current.next;
            }

            if (current == null) {
                System.out.println("Invalid position. Position exceeds the length of the list.");
                return;
            }

            // Insert the new node at the specified position
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // ... (existing code)

    // ---> appending data
    public void appendingData(T data) {
        Node<T> newNode = new Node<T>(data); // Create a new node with the provided data

        if (head == null) {
            // If the list is empty, set the new node as the head
            head = newNode;
        } else {
            // If the list is not empty, traverse to the end and add the new node
            Node<T> current = head;
            // temp node current
            while (current.next != null) {
                // Move to the next node\
                current = current.next;
            }
            current.next = newNode; // Set the new node as the next node of the last node

        }
    }

    // Method to display the contents of the linked list
    public void display() {
        Node<T> current = head; // Start from the head of the list
        while (current != null) {
            System.out.print(current.data + " -> "); // Print the data of the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line after displaying all nodes
    }
}

// ExampleLinkedList class demonstrates the usage of MyLinkedList
public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(); // Create an instance of MyLinkedList
        CustomStack<Integer> myStack = new CustomStack<Integer>();

        // Add nodes with data 12, 13, and 14 to the linked list
        myLinkedList.appendingData(56);
        myLinkedList.appendingData(30);
        myLinkedList.appendingData(70);

        System.out.println("Linked List:");
        myLinkedList.display(); // Display the contents of the linked list
        myLinkedList.addInBetween(40, 1);

        System.out.println("Linked List after adding at position 2:");
        myLinkedList.display(); // Display the updated linked list

        System.out.println("my stack");
        myStack.add(70);
        myStack.add(30);
        myStack.add(56);
        myStack.displayStack();

    }
}
