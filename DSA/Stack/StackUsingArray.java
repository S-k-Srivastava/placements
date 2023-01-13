
public class StackUsingArray {
    public static void main(String[] args) {
        MyCustomArrayStack<String> myArrayStack = new MyCustomArrayStack<>();
        myArrayStack.push("A");
        myArrayStack.push("B");
        myArrayStack.push("C");
        myArrayStack.printStack();
        System.out.println("is Empty : " + myArrayStack.isEmpty());
        myArrayStack.pop();
        System.out.println(myArrayStack.stack);
        System.out.println(myArrayStack.peek());
        myArrayStack.pop();
        myArrayStack.pop();
        System.out.println("is Empty : " + myArrayStack.isEmpty());
    }
}