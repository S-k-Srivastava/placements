import java.util.Iterator;
import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        // Creating a Stack using inbuilt Class that extends Vector
        Stack<Integer> stack = new Stack<>();

        // Pushing and printing whole stack
        System.out.println("Inserting...");
        System.out.println();
        System.out.println("Initially : " + stack);
        stack.push(7);
        stack.push(3);
        stack.push(9);
        stack.push(4);

        // [7,3,9,4] -> top
        System.out.println();
        System.out.println("After Pushing : " + stack);

        // Popping and printing

        System.out.println();
        stack.pop();
        System.out.println("After Popping once : " + stack);

        // Peek()
        System.out.println("Top Element : " + stack.peek());

        // IsEmpty ?

        System.out.println("Is Stack Empty : " + stack.isEmpty());

        // Sorting Stack
        stack.sort(null);

        System.out.println("After Sorting : " + stack);

        // Searching 3

        System.out.println("Position of 3 in Stack : " + stack.search(3));

        // Iterating Individually in stack

        Iterator<Integer> it = stack.iterator();

        System.out.print("Printing using Iterator : ");

        while (it.hasNext()) {
            int i = it.next();
            System.out.print(i + " ");
        }
    }
}
