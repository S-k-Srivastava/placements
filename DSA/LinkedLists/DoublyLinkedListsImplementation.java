public class DoublyLinkedListsImplementation {
    public static void main(String[] args) {
        CustomDoublyLinkedLists customDoublyLinkedLists = new CustomDoublyLinkedLists();
        customDoublyLinkedLists.insertEnd(1);
        customDoublyLinkedLists.insertEnd(2);
        customDoublyLinkedLists.insertFirst(3);
        customDoublyLinkedLists.insertFirst(8);
        customDoublyLinkedLists.display();
    }
}

class CustomDoublyLinkedLists {
    Node head;
    Node tail;

    class Node {
        Node prev;
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = null;
            tail.prev = null;

        } else {
            newNode.prev = tail;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = null;
            tail.prev = null;
        } else {
            newNode.next = head;
            head = newNode;
            newNode.prev = null;
            Node temp = newNode.next;
            temp.prev = newNode;
            newNode.next = temp;
        }
    }

    void display() {
        Node n1 = head;
        System.out.print("Doubly Linked List : ");
        while (n1 != null) {
            System.out.print(n1.data + " ");
            n1 = n1.next;
        }
        System.out.println();
    }
}
