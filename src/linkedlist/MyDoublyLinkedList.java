package linkedlist;

public class MyDoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void addToFront(E data) {
        Node<E> node= new Node<>(data);
        if(head == null) {
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
        }
        head = node;
        ++size;
    }

    public void addToEnd(E data) {
        Node<E> node = new Node<>(data);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        ++size;
    }
    public E removeFromFront() {
        if (isEmpty()) return null;
        Node<E> node = head;
        E data = node.data;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.previous = null;
        }
        node.next = null;
        --size;
        return data;
    }

    public E removeFromEnd() {
        if (isEmpty()) return null;
        Node<E> node = tail;
        E data = node.data;
        tail = node.previous;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        node.previous = null;
        --size;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }
    class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> previous;

        public Node (E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void printList() {
        Node<E> node = head;
        if (node == null) {
            System.out.println("{ empty }");
            return;
        }
        while (node.next != null) {
            System.out.println(node);
            node = node.next;
        }
        // For last item
        System.out.println(node);
    }
}
