public class SinglyLinkedListsImplementation {
    public static void main(String[] args) {
        CustomSinglyLinkedList singlyLinkedList = new CustomSinglyLinkedList();
        singlyLinkedList.insertEnd(1);
        singlyLinkedList.insertEnd(2);
        singlyLinkedList.insertEnd(3);
        singlyLinkedList.insertFirst(377);
        singlyLinkedList.insertAt(2, 123);
        singlyLinkedList.removeAt(3);
        singlyLinkedList.display();
    }

}

class CustomSinglyLinkedList {
    Node tail;
    Node head;

    class Node {
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
            newNode.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = null;
        }
    }

    void insertAt(int pos, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int index = 1;
        while (index < pos - 1) {
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void removeFirst() {
        head = head.next;
    }

    void removeAt(int pos) {
        Node temp = head;
        int index = 1;
        while (index < pos - 1) {
            temp = temp.next;
            index++;
        }
        Node toDelete = temp.next;
        temp.next = toDelete.next;
    }

    void removeLast() {
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    void display() {
        Node n1 = head;
        System.out.print("Linked List : ");
        do {
            System.out.print(n1.data + " ");
            n1 = n1.next;
        } while (n1 != null);
        System.out.println();
    }
}