public class CustomStack<T> {

    Node<T> head;

    public void add(T data) {

        Node<T> addDataToStack = new Node<T>(data);
        addDataToStack.next = head;
        // the ref part is null now
        head = addDataToStack;
        // now i add ref to head to access the stack

    }

    public void displayStack() {

        Node<T> current = head;
        while (current != null) {

            System.out.println("[ " + current.data + " ]");
            current = current.next;
            System.out.println();

        }

    }

}
