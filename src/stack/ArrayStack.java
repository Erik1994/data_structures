package stack;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] array;
    private int top;
    public ArrayStack(int capacity) {
        array = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == array.length) {
            Employee[] tempArray = new Employee[array.length * 2];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
        }
        array[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = array[--top];
        array[top] = null;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top - 1];
    }

    public int getSize() {
        return top;
    }
    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top -1; i >= 0; --i) {
            System.out.println(array[i]);
        }
    }
}
