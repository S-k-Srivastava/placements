public class CircularLinkedListsImplementation {
    public static void main(String[] args) {
        CustomCircularLinkedList circularLinkedList = new CustomCircularLinkedList();
        circularLinkedList.insertEnd(1);
        circularLinkedList.insertEnd(2);
        circularLinkedList.insertEnd(3);
        circularLinkedList.insertEnd(4);
        circularLinkedList.removeFirst();
        circularLinkedList.removeLast();
        circularLinkedList.insertFirst(12);
        circularLinkedList.insertAt(2, 24455);
        circularLinkedList.removeAt(2);
        circularLinkedList.display();
    }
}

class CustomCircularLinkedList {
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
            tail.next = head;
        }
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
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

    void removeFirst() {
        head = head.next;
        tail.next = head;
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
        temp.next = head;
        tail = temp;
    }

    void display() {
        Node n1 = head;
        System.out.print("Circular Linked List : ");
        do {
            System.out.print(n1.data + " ");
            n1 = n1.next;
        } while (n1 != head);
        System.out.println();
    }
}