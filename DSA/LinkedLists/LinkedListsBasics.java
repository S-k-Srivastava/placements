import java.util.LinkedList;
import java.util.Stack;

public class LinkedListsBasics {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        // adding
        System.out.print("Adding Elements : ");
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);

        System.out.println(l1);

        // removing
        System.out.print("Removing from first : ");
        l1.remove();
        System.out.print(l1);
        System.out.println();
        System.out.print("Removing from first : ");
        l1.removeFirst();
        System.out.print(l1);
        System.out.println();
        System.out.print("Removing from last : ");
        l1.removeLast();
        System.out.print(l1);
        System.out.println();

        System.out.print("Removing from Index 2 : ");
        l1.remove(2);
        System.out.print(l1);
        System.out.println();

        System.out.print("Updates at 2 index : ");
        l1.add(2, 177);
        System.out.print(l1);
        System.out.println();

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(123);
        stack.push(1234);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.addAll(stack);
        System.out.println("Stack : " + stack);
        System.out.println("Linked List Copied from Stack : " + l2);

    }
}