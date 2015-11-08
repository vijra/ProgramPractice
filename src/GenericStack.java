import java.util.Objects;

/**
 * Created by vmohanar on 10/26/15.
 */
public class GenericStack<T extends Object> {

    private int capacity;
    private int top;
    private T[] stack;

    GenericStack(int capacity) {
        this.capacity = capacity;
        this.top = -1;
        stack = (T[]) new Object[capacity];
    }

    public void push(T value) {
        if (top >= (capacity - 1)) {
            p("Stack is Full");
        } else {
            stack[++this.top] = value;
            p("Pushed " + stack[this.top]);
        }
    }

    public void pop() {
        if (top < 0) {
            p("Stack is Empty");
        } else {
            p("Removed " + stack[top]);
            top--;
        }
    }

    public static void main(String[] args) {
        GenericStack <Integer> stack =  new GenericStack<> (5);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(4);
        stack.push(42);
        stack.push(44);
        stack.push(34);
        stack.push(334);
        stack.push(334);
    }

    public static void p(String out) {
        System.out.println(out);
    }
}
