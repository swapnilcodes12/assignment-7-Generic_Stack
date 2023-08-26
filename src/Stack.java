import java.util.EmptyStackException;

public class Stack<T> {
    private T[] stack;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.top = -1;
        stack = (T[]) new Object[size];
    }

    public T peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (size - 1);
    }

    public boolean push(T data) {
        if (isFull()) {
            return false;
        }
        stack[++top] = data;
        return true;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = stack[top];
        stack[top] = null;
        top--;
        return data;
    }

    public void show() {
        for(T n: stack)
            System.out.println(n);
    }
}





