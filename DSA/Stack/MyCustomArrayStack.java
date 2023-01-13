import java.util.ArrayList;

public class MyCustomArrayStack<T> {
    ArrayList<T> stack = new ArrayList<>();
    static int top = -1;

    public void printStack() {
        System.out.println(stack);
    }

    public ArrayList<T> push(T element) {
        top++;
        stack.add(element);
        return stack;
    }

    public void pop() {
        stack.remove(top);
        top--;
    }

    public T peek() {
        return stack.get(top);
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

}
