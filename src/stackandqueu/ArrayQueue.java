package stackandqueu;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] array;
    private int front = 0;
    private int back = 0;

    public ArrayQueue(int capacity) {
        array = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (back == array.length) {
            Employee[] temp = new Employee[array.length * 2];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp;
        }
        array[back++] = employee;
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = array[front];
        array[front++] = null;
        if(size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return array[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; ++i) {
            System.out.println(array[i]);
        }
    }
}
